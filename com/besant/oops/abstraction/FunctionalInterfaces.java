package com.besant.oops.abstraction;

import java.io.Serializable;
import java.util.function.*;

public class FunctionalInterfaces {


    // Marker Interfaces   - Interfaces without any abstract methods
    // Serializable, Cloneable


    // Functional Interfaces  - Interface with only one abstract method.
    //Predicate  - Take a input as a parameter and return boolean
    //Consumer  -  Take an input as parameter and not return anything
    //Supplier  - Not take any input and return something
    // Bi-Predicate - Take two input as a parameter and return boolean
    // Bi-Consumer - Take two input as a parameter and return nothing


    public static void main(String[] args) {
    // () -> {};
       Predicate<String> stringPredicate= new Predicate<String>() {
           @Override
           public boolean test(String s) {
               return false;
           }
       };

        Predicate<String> stringPredicates= input -> true;


      Predicate<Integer> predicate= number ->  number%2==0;
      boolean isEven= predicate.test(4);
      System.out.println(isEven);

      Consumer<String> consumer = input -> System.out.println(input);
      consumer.accept("test");

      Supplier<Double> supplier= () -> {
        return Double.valueOf("2");
      };
      double val= supplier.get();

      int a=50;
      int b=20;
      BiPredicate<Integer,Integer> biPredicate= (input1, input2) -> {return input1 > input2;};
     boolean res= biPredicate.test(a,b);
        System.out.println(res);

        BiConsumer<Integer,Integer> biConsumer= (input1, input2) -> {
            if(input1> input2)
                System.out.println("Input 1 is greater");
            else
                System.out.println("Input 2 is greater");
        };
        biConsumer.accept(a,b);

       // function.apply("1");
        Output<Integer,String,Integer> output= (integer, integer2) -> " ";








    }
}
