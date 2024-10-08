package com.test.prob4;

@FunctionalInterface
public interface TriFunction<S1, S2, S3, S4> {
    S4 apply(S1 s1, S2 s2, S3 s3);
}
