package org.glavo.gini.runtime.internal;

import org.glavo.gini.runtime.Module;
import org.glavo.gini.runtime.ModuleLoader;

import java.util.HashMap;
import java.util.Objects;

public class ClassLoaderModuleLoader implements ModuleLoader {
    public static ClassLoaderModuleLoader global = new ClassLoaderModuleLoader(Module.class.getClassLoader());

    public static Module loadModule(ClassLoader loader, String name) {
        Objects.requireNonNull(name);
        try {
            Class<?> c = Class.forName(name, true, loader);
            return (Module) c.getConstructor().newInstance();
        } catch (Throwable ignored) {
            return null;
        }
    }

    private ClassLoader loader;
    private final HashMap<String, Module> modules = new HashMap<>();

    public ClassLoaderModuleLoader() {
        this(null);
    }

    public ClassLoaderModuleLoader(ClassLoader loader) {
        this.loader = loader;
    }

    @Override
    public Module getModule(String name) {
        Objects.requireNonNull(name);
        Module module;
        module = modules.get(name);
        if (module != null) {
            return module;
        }

        module = loadModule(Module.class.getClassLoader(), name);
        if (module != null) {
            modules.put(name, module);
        }
        return module;
    }

    public ClassLoader getLoader() {
        return loader;
    }

}
