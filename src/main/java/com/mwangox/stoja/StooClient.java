package com.mwangox.stoja;

import com.mwangox.stoja.config.StooConfig;
import io.grpc.*;
import io.grpc.netty.shaded.io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class StooClient implements StooOperations{
     private final StooConfig stooConfig;
    private final KVServiceGrpc.KVServiceBlockingStub client;
    public static  final long DEFAULT_TIMEOUT_MS = 30000;

    public StooClient(StooConfig stooConfig){
        StooAssertions.shouldNotBeNull(stooConfig, "StooConfig cannot be null");
        this.stooConfig = stooConfig;
        ManagedChannel channel = Grpc.newChannelBuilder(stooConfig.getEndpoint(), InsecureChannelCredentials.create()).build();
        if(stooConfig.isUseTls()){
            channel = createSecuredChannel(stooConfig);
        }
        client = KVServiceGrpc.newBlockingStub(channel)
                .withDeadlineAfter(stooConfig.getTimeoutAfterMs() != 0 ? stooConfig.getTimeoutAfterMs() : DEFAULT_TIMEOUT_MS, TimeUnit.MILLISECONDS);
    }

    public static StooClient newStooClient(StooConfig stooConfig){
        return new StooClient(stooConfig);
    }
    private static ManagedChannel createSecuredChannel(StooConfig stooConfig) {
        StooConfig.TLS tls = stooConfig.getTls();
        StooAssertions.shouldNotBeNull(tls, "TLS specs must be defined if isTls set to true");
        try {
            ChannelCredentials channelCredentials;
            if (tls.isSkipTlsVerification()) {
                channelCredentials = TlsChannelCredentials.newBuilder()
                        .trustManager(InsecureTrustManagerFactory.INSTANCE.getTrustManagers())
                        .build();
                return Grpc.newChannelBuilder(stooConfig.getEndpoint(), channelCredentials)
                        .build();
            } else {
                channelCredentials = TlsChannelCredentials.newBuilder()
                        .trustManager(new File(tls.getCaCertPath()))
                        .build();
                String serverNameOverride = stooConfig.getTls().getServerNameOverride();
                ManagedChannelBuilder<?> managedChannelBuilder = Grpc.newChannelBuilder(stooConfig.getEndpoint(), channelCredentials);
                if(serverNameOverride == null || serverNameOverride.isEmpty()){
                    return managedChannelBuilder.build();
                }
                return managedChannelBuilder
                        .overrideAuthority(serverNameOverride)
                        .build();
            }
        }catch (IOException e){
            throw new StooException("Failed to create secured channel", e);
        }
    }

    @Override
    public String get(String namespace, String profile, String key) {
        Stoo.GetResponse response = client.getService(Stoo.GetRequest.newBuilder()
                .setNamespace(namespace)
                .setProfile(profile)
                .setKey(key)
                .build());
        return response.getData();
    }

    @Override
    public String set(String namespace, String profile, String key, String value) {
        Stoo.SetKeyResponse response = client.setKeyService(Stoo.SetKeyRequest.newBuilder()
                .setNamespace(namespace)
                .setProfile(profile)
                .setKey(key)
                .setValue(value)
                .build());
        return response.getData();
    }

    @Override
    public String delete(String namespace, String profile, String key) {
        Stoo.DeleteKeyResponse response = client.deleteKeyService(Stoo.DeleteKeyRequest.newBuilder()
                .setNamespace(namespace)
                .setProfile(profile)
                .setKey(key)
                .build());
        return response.getData();
    }

    @Override
    public Map<String, String> getAll(String namespace, String profile) {
        Stoo.GetByNamespaceAndProfileResponse response = client.getServiceByNamespaceAndProfile(Stoo.GetByNamespaceAndProfileRequest.newBuilder()
                .setNamespace(namespace)
                .setProfile(profile)
                .build());
        return response.getDataMap();
    }

    @Override
    public String getDefault(String key) {
        verifyDefaultNamespaceAndProfile();
        return get(stooConfig.getDefaultNamespace(), stooConfig.getDefaultProfile(), key);
    }

    @Override
    public String setDefault(String key, String value) {
        verifyDefaultNamespaceAndProfile();
        return set(stooConfig.getDefaultNamespace(), stooConfig.getDefaultProfile(), key, value);
    }

    @Override
    public String deleteDefault(String key) {
        verifyDefaultNamespaceAndProfile();
        return delete(stooConfig.getDefaultNamespace(), stooConfig.getDefaultProfile(), key);
    }

    @Override
    public Map<String, String> getAllDefault() {
        verifyDefaultNamespaceAndProfile();
        return getAll(stooConfig.getDefaultNamespace(), stooConfig.getDefaultProfile());
    }

    public void verifyDefaultNamespaceAndProfile(){
        StooAssertions.shouldNotBeNullOrEmpty(stooConfig.getDefaultProfile(), "defaultProfile must be defined to use default methods");
        StooAssertions.shouldNotBeNullOrEmpty(stooConfig.getDefaultNamespace(), "defaultNamespace must be defined to use default methods");
    }
}
