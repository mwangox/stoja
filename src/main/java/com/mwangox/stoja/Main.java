package com.mwangox.stoja;

import com.mwangox.stoja.config.StooConfig;
import io.grpc.*;
import java.util.logging.Logger;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        try {
            StooConfig stooConfig =  StooConfig.newDefaultStooConfig()
                    .defaultNamespace("my-app")
                    .defaultProfile("prod")
                    .useTls(true)
                    .tls(StooConfig.TLS.create()
                            .skipTlsVerification(false)
                            .serverNameOverride("x.test.example.com")
                            .caCertPath("/opt/systems/apps/stoja/src/main/resources/ca_cert.pem"));
            StooClient stooClient =  StooClient.newStooClient(stooConfig);
            logger.info("Password is " + stooClient.getDefault("database.usernamexx"));
            stooClient.setDefault("database.hostname", "nitra.co.tz");
            logger.info("ALL keys " + stooClient.getAllDefault());
            logger.info("Delete status: " + stooClient.deleteDefault("database.password"));
        }catch (Exception e){
            Status status = Status.fromThrowable(e);
            logger.info("Status === " + status.getCode());
            logger.info("Exception " + e.getMessage());
            e.printStackTrace();
        }
    }
}