package com.besant.oops.inheritance;

interface Car{
    void drive();

    // default methods and static methods

    default String model(){
        return "2022";
    }

    static void type(){

    }
}

interface Bike{
    void drive();

    default String model(){
        return "2022";
    }
}

class Vehicle implements Car,Bike{

    @Override
    public void drive() {
        System.out.println("Vehicle");
    }

    @Override
    public String model() {
       return  "4000";
    }

}

public class MultipleInheritanceDemo{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.model();
        Car.type();

    }
}


