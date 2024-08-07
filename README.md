[![](https://jitpack.io/v/mwangox/stoja.svg)](https://jitpack.io/#mwangox/stoja)


# Stoja

`Stoja` is a java client library used to connect to [stookv](https://github.com/mwangox/stookv), a key-value datastore.

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

### Extended configuration

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
//Set normal key
stooClient.set("my-app", "prod", "database.username", "lauryn.hill");

//Get stored value from a key
String value = stooClient.get("my-app", "prod", "database.username");
System.out.println(value);

//Set secret key
stooClient.setSecret("my-app", "prod", "database.password", "theScrore@1996");

//Get all keys
Map<String, String> kv = stooClient.getAllByNamespaceAndProfile("my-app", "prod");
System.out.println(kv);

//Delete a key
stooClient.delete("my-app", "prod", "database.hostname");

//-----------------------------------------------------------------------------//
//Set normal key to the default namespace and profile
stooClient.setDefault("database.hostname", "127.0.0.1");

//Get value of a key from the default namespace and profile
String valueDef = stooClient.getDefault("database.hostname");
System.out.println(valueDef);

//Set secret key to the default namespace and profile
stooClient.setSecretDefault("database.hostname", "127.0.0.1");

//Get all keys from the default namespace and profile
Map<String, String> kvDef = stooClient.getAllByDefaultNamespaceAndProfile();
System.out.println(kvDef);

//Delete a key from the default namespace and profile
stooClient.deleteDefault("database.hostname");
```

## License

The project is licensed under [MIT license](./MIT-LICENSE).

### Contribution

Unless you explicitly state otherwise, any contribution intentionally submitted
for inclusion in `stoja` by you, shall be licensed as MIT, without any additional
terms or conditions.



