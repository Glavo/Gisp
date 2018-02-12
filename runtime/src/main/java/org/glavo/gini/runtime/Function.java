package org.glavo.gini.runtime;

import java.util.List;

@FunctionalInterface
public interface Function extends java.util.function.Function<List<Object>, Object> {
    Object apply(List<Object> args);
}
