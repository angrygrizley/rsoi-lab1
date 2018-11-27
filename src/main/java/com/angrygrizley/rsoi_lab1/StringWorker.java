package com.angrygrizley.rsoi_lab1;

public class StringWorker {
    public static String getReverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
