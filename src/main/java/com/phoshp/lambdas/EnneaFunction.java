package com.phoshp.lambdas;

@FunctionalInterface
public interface EnneaFunction<A, B, C, D, E, F, G, H, I, R> {

    R apply(A a, B b, C c, D d, E e, F f, G g, H h, I i);
}
