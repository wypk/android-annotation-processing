package com.example.processor;

import java.util.Collection;

/**
 * Created by Wai Yan on 1/5/19.
 */
public class Utils {

    private Utils() {
        // Private Empty Constructor
    }

    public static boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }
}
