package com.mwangox.stoja;

import java.util.Map;

public interface StooOperations {
    /** Get key from a given namespace and profile.
     * @param namespace namespace to be used.
     * @param profile   profile to be used.
     * @param key       a key to read stored value.
     * @return stored value at a given key.
     * */
    String get(String namespace, String profile, String key);
    /** Set value to a key for a given namespace and profile
     * @param namespace namespace to be used.
     * @param profile   profile to be used.
     * @param key       a key to set value.
     * @param value     a value to be stored.
     * @return acknowledge server message.
     * */
    String set(String namespace, String profile, String key, String value);
    /** Set secret value to a key for a given namespace and profile
     * @param namespace namespace to be used.
     * @param profile   profile to be used.
     * @param key       a secret key to set value.
     * @param value     a secret value to be stored.
     * @return acknowledge server message.
     * */
    String setSecret(String namespace, String profile, String key, String value);
    /** Delete a key from a given namespace and profile.
     * @param namespace namespace to be used.
     * @param profile   profile to be used.
     * @param key       a key to be deleted.
     * @return acknowledge server message.
     * */
    String delete(String namespace, String profile, String key);
    /** Get all keys and values from a given namespace and profile.
     * @param namespace namespace to be used.
     * @param profile   profile to be used.
     * @return all key-values from given namespace and profile.
     * */
    Map<String, String> getAllByNamespaceAndProfile(String namespace, String profile);
    /** Get key from default namespace and profile.
     * @param key       a key to read value.
     * @return stored value from a key.
     * */
    String getDefault(String key);
    /** Set value to a key for default namespace and profile.
     * @param key       a key to set value.
     * @param value     a value to be stored.
     * @return acknowledge server message.
     * */
    String setDefault(String key, String value);
    /** Set secret value to a key for default namespace and profile.
     * @param key       a secret key.
     * @param value     a value to be stored.
     * @return acknowledge server message.
     * */

    String setSecretDefault(String key, String value);
    /** Delete a key from default namespace and profile.
     * @param key       a key to be deleted from default namespace and profile.
     * @return acknowledge server message.
     * */
    String deleteDefault(String key);
    /** Get all keys and values from default namespace and profile.
     * @return All key-values from default namespace and profile.
     * */
    Map<String, String> getAllByDefaultNamespaceAndProfile();

}
