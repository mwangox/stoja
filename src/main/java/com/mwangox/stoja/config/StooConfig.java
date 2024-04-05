package com.mwangox.stoja.config;

import com.mwangox.stoja.StooAssertions;
import lombok.Getter;


@Getter
public class StooConfig {
    private final String endpoint;
    private boolean useTls;
    private long timeoutAfterMs;
    private String defaultNamespace;
    private String defaultProfile;
    private TLS tls;
    private static final String DEFAULT_TARGET = "localhost:50051";

    public StooConfig(String endpoint){
        StooAssertions.shouldNotBeNullOrEmpty(endpoint, "endpoint cannot be null or empty");
        this.endpoint = endpoint;
    }

    public static StooConfig newStooConfig(String endpoint){
        return new StooConfig(endpoint);
    }

    public static StooConfig newDefaultStooConfig(){
        return new StooConfig(DEFAULT_TARGET);
    }

    public StooConfig useTls(boolean useTls){
        this.useTls = useTls;
        return this;
    }

    public StooConfig timeoutAfterMs(long timeoutAfter){
        this.timeoutAfterMs = timeoutAfter;
        return this;
    }

    public StooConfig defaultNamespace(String defaultNamespace){
        this.defaultNamespace = defaultNamespace;
        return this;
    }

    public StooConfig defaultProfile(String defaultProfile){
        this.defaultProfile = defaultProfile;
        return this;
    }
    public StooConfig tls(TLS tls){
        this.tls = tls;
        return this;
    }
    @Getter
    public static class TLS {
        private boolean skipTlsVerification;
        private String caCertPath;
        private String serverNameOverride;

        public TLS skipTlsVerification(boolean skipTlsVerification){
            this.skipTlsVerification = skipTlsVerification;
            return this;
        }

        public TLS serverNameOverride(String serverNameOverride){
            this.serverNameOverride = serverNameOverride;
            return this;
        }

        public TLS caCertPath(String caCertPath){
            this.caCertPath = caCertPath;
            return this;
        }

        public static TLS create(){
            return new TLS();
        }
    }
}
