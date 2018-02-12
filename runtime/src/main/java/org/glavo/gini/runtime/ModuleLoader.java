package org.glavo.gini.runtime;

import org.glavo.gini.runtime.internal.ClassLoaderModuleLoader;

public interface ModuleLoader {
    static ModuleLoader getGlobalModuleLoader() {
        return ClassLoaderModuleLoader.global;
    }

    Module getModule(String name);
}
