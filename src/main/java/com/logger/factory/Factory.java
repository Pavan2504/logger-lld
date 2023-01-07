package com.logger.factory;

public interface Factory<U, V> {
    U get(V type);
}
