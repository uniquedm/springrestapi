package com.demo.cryptography.utils;

public class CryptographicUtils {
    public static String decrypt(String input, String key) {
        return String.format("%s %s", input, key);
    }
}
