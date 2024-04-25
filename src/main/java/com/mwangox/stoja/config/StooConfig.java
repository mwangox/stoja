package com.mwangox.stoja.config;

import com.mwangox.stoja.StooAssertions;
import com.mwangox.stoja.StooProtocolException;
import lombok.Getter;

/**
 * Used to stoo various StooClient configurations.
 * */
@Getter
public class StooConfig {
    private final String endpoint;
    private boolean useTls;
    private long timeoutAfterMs;
    private String defaultNamespace;
    private String defaultProfile;
    private TLS tls;
    private static final String DEFAULT_TARGET = "localhost:50051";

    /** Create StooConfig from grpc service endpoint
     * @param endpoint                 grpc service endpoint http or https
     * @throws StooProtocolException   if invalid endpoint is provided
     * */
    public StooConfig(String endpoint){
        StooAssertions.shouldNotBeNullOrEmpty(endpoint, "endpoint cannot be null or empty");
        this.endpoint = endpoint;
    }

    /** Convenient method for creating StooConfig
     *  @param endpoint     grpc service endpoint http or https
     *  @return StooConfig
     * */
    public static StooConfig newStooConfig(String endpoint){
        return new StooConfig(endpoint);
    }
    /** Creating StooConfig from default grpc service endpoint
     * @return StooConfig
     * */
    public static StooConfig newDefaultStooConfig(){
        return new StooConfig(DEFAULT_TARGET);
    }

    /** Specify if TLS is enabled or not so as TLS configurations can be applied accordingly
     * @param useTls  true/false
     * @return StooConfig
     * */
    public StooConfig useTls(boolean useTls){
        this.useTls = useTls;
        return this;
    }

    /** Set max waiting time for response from grpc service
     * @param timeoutAfter timeout in milliseconds
     * @return StooConfig
     * */
    public StooConfig timeoutAfterMs(long timeoutAfter){
        this.timeoutAfterMs = timeoutAfter;
        return this;
    }

    /** Set default namespace
     * @param defaultNamespace default namespace to be applied
     * @return StooConfig
     * */
    public StooConfig defaultNamespace(String defaultNamespace){
        this.defaultNamespace = defaultNamespace;
        return this;
    }

    /** Set defaultProfile namespace.
     * @param defaultProfile default profile to be applied.
     * @return StooConfig
     * */
    public StooConfig defaultProfile(String defaultProfile){
        this.defaultProfile = defaultProfile;
        return this;
    }

    /** Set TLS configurations block if useTls is set to true
     * @param tls TLS block
     * @return StooConfig
     * */
    public StooConfig tls(TLS tls){
        this.tls = tls;
        return this;
    }
    @Getter
    public static class TLS {
        private boolean skipTlsVerification;
        private String caCertPath;
        private String serverNameOverride;

        /** Used to tell if StooKV certificate is to be skipped or not.
         * @param skipTlsVerification set true if you want to skip verification otherwise false.
         * @return TLS
         * */
        public TLS skipTlsVerification(boolean skipTlsVerification){
            this.skipTlsVerification = skipTlsVerification;
            return this;
        }

        /** Set StooKV hostname to be used in hostname verification.
         * @param serverNameOverride server hostname
         * @return TLS
         * */
        public TLS serverNameOverride(String serverNameOverride){
            this.serverNameOverride = serverNameOverride;
            return this;
        }

        /** Set CA certificate
         * @param caCertPath CA certificate path
         * @return TLS
         * */
        public TLS caCertPath(String caCertPath){
            this.caCertPath = caCertPath;
            return this;
        }

        /** Convenient method for creating TLS
         *  @return TLS
         * */
        public static TLS create(){
            return new TLS();
        }
    }
}
