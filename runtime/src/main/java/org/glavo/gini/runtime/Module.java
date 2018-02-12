package org.glavo.gini.runtime;

import java.util.HashMap;
import java.util.Objects;

public abstract class Module {
    public static Module forName(String name) {
        return ModuleLoader.getGlobalModuleLoader().getModule(name);
    }

    public abstract boolean hasField(String name);

    public abstract void putField(String name, Object value);

    public abstract Object getValue(String name);
}
