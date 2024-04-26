[![](https://jitpack.io/v/mwangox/stoja.svg)](https://jitpack.io/#mwangox/stoja)


# Stoja

`Stoja` is a java client library used to connect to `StooKV`.

Key features are:
- SSL/TLS supports.
- Default namespace and profile.
- Supports secret and non-secret keys.

## Installation

Minimal supported java version is 17.

`gradle jitpack`
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

```groovy
dependencies {
    implementation 'com.github.mwangox:stoja:1.0.9'
}
```

### Minimal configuration

```java
import com.mwangox.stoja.config.StooConfig;
import com.mwangox.stoja.StooClient;

StooConfig stooConfig =  StooConfig.newDefaultStooConfig();
StooClient stooClient =  StooClient.newStooClient(stooConfig);
```

### Full configuration

```java
import com.mwangox.stoja.config.StooConfig;
import com.mwangox.stoja.StooClient;

StooConfig stooConfig =  StooConfig.newStooConfig("localhost:50051")
        .defaultNamespace("my-app")
        .defaultProfile("prod")
        .useTls(true)
        .tls(StooConfig.TLS.create()
                .skipTlsVerification(false)
                .serverNameOverride("stookv.com")
                .caCertPath("/stoo-kv/ca_cert.pem"));
StooClient stooClient =  StooClient.newStooClient(stooConfig);
```

### Examples

```java
eventService.addHandler(DummyEvent.class, e -> Mono.just(true), 1);
```



