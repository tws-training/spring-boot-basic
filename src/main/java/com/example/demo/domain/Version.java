package com.example.demo.domain;

public class Version {

    private static int major = 1;
    private static int minor = 0;
    private static int patch = 0;

    public static void reset() {
        major = 1;
        minor = 0;
        patch = 0;
    }

    public static String getVerStr() {
        return major + "." + minor + "." + patch;
    }

    public static void updateMinor() {
        minor += 1;
    }
}
