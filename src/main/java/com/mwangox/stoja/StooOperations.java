package com.mwangox.stoja;

import java.util.Map;

public interface StooOperations {
    /** Get key from a given namespace and profile.*/
    String get(String namespace, String profile, String key);
    /** Set value to a key for a given namespace and profile */
    String set(String namespace, String profile, String key, String value);

    /** Set secret value to a key for a given namespace and profile */
    String setSecret(String namespace, String profile, String key, String value);

    /** Delete a key from a given namespace and profile. */
    String delete(String namespace, String profile, String key);
    /** Get all keys and values from a given namespace and profile. */
    Map<String, String> getAllByNamespaceAndProfile(String namespace, String profile);

    /** Get key from default namespace and profile. */
    String getDefault(String key);
    /** Set value to a key for default namespace and profile. */
    String setDefault(String key, String value);
    /** Set secret value to a key for default namespace and profile. */
    String setSecretDefault(String key, String value);
    /** Delete a key from default namespace and profile. */
    String deleteDefault(String key);
    /** Get all keys and values from default namespace and profile. */
    Map<String, String> getAllDefault();

}
