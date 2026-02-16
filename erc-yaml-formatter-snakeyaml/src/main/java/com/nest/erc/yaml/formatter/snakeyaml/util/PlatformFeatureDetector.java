package com.nest.erc.yaml.formatter.snakeyaml.util;


public class PlatformFeatureDetector {

    private Boolean isRunningOnAndroid = null;

    public boolean isRunningOnAndroid() {
        if (isRunningOnAndroid == null) {
            String name = System.getProperty("java.runtime.name");
            isRunningOnAndroid = (name != null && name.startsWith("Android Runtime"));
        }
        return isRunningOnAndroid;
    }
}