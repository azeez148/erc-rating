package com.nest.erc.yaml.formatter.snakeyaml.constructor;

/**
 * Construct instances with a custom Class Loader.
 */
public class CustomClassLoaderConstructor extends Constructor {
    private ClassLoader loader = CustomClassLoaderConstructor.class.getClassLoader();

    public CustomClassLoaderConstructor(ClassLoader cLoader) {
        this(Object.class, cLoader);
    }

    public CustomClassLoaderConstructor(Class<? extends Object> theRoot, ClassLoader theLoader) {
        super(theRoot);
        if (theLoader == null) {
            throw new NullPointerException("Loader must be provided.");
        }
        this.loader = theLoader;
    }

    @Override
    protected Class<?> getClassForName(String name) throws ClassNotFoundException {
        return Class.forName(name, true, loader);
    }
}