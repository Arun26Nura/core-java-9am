package com.besant.oops.polymorphism;

class Bike{

    public void add(){
        System.out.println("Bike");
    }
    public void add(int a){

    }
    public void add(int a, int b){

    }

}

class Yamaha extends Bike{

    public void add(){
        System.out.println("Yamaha");
    }
}
class Pulsor extends Bike{
    @Override
    public void add(){
        System.out.println("Pulsor");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Bike bike= new Yamaha();
        bike.add();
        Bike bike2= new Pulsor();
        bike2.add();
    }
}
