package com.besant.oops.abstraction;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate {

    @Override
    public boolean test(Object o) {
        return false;
    }
}

class Demo{
    public static void main(String[] args) {
        Predicate impl=  new PredicateImpl();
        impl.test(0);
    }
}
