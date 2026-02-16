package com.nest.erc.yaml.formatter.snakeyaml.extensions.compactnotation;

public class PackageCompactConstructor extends CompactConstructor {
    private String packageName;

    public PackageCompactConstructor(String packageName) {
        this.packageName = packageName;
    }

    @Override
    protected Class<?> getClassForName(String name) throws ClassNotFoundException {
        if (name.indexOf('.') < 0) {
            try {
                Class<?> clazz = Class.forName(packageName + "." + name);
                return clazz;
            } catch (ClassNotFoundException e) {
                // use super implementation
            }
        }
        return super.getClassForName(name);
    }
}