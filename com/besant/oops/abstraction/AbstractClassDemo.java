package com.besant.oops.abstraction;

abstract class Bike{

    public abstract void add();

    public void remove(){

    }
}

class Yamaha extends Bike{

    @Override
    public void add() {

    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Bike yamaha=  new Yamaha();
    }
}
