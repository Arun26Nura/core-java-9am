package com.besant.oops.inheritance;


class A {
    // Properties of class A
    int number=10;

    public void printName(){
        System.out.println("A");
    }
}

class B extends A{

    public void testMethod(){
        System.out.println("TEST");
    }

}

public class InheritanceDemo {
    public static void main(String[] args) {
        A a=new A();
        a.printName();


        B b= new B();
        b.printName();
        b.testMethod();

    }
}
