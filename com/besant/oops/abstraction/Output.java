package com.besant.oops.abstraction;

@FunctionalInterface
public interface Output<T,R,U> {

    R test(T t, U u);
}
