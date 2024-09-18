package com.test.prob4;

@FunctionalInterface
public interface TriFunction<T,U, G, R> {
    R apply(T arg1, U arg2, G arg3);
}
