package com.besant.classes;

public class MethodDemo {
    public static void main(String[] args) {
       String bikeName= Bike.returnName("Pulsor");
       Bike bike=new Bike(2022, "Hero");  // Constructor of the class.
       Bike bike2= new Bike();
        System.out.println(bike);
        System.out.println(bike2);
        bike.returnModel();
        System.out.println(bike.model);
        System.out.println(bike.names);

    }
}

// constructor - Constructor is similar to method which has same name as class w
// without return type.

// 2 types - No Argument Constructor (Default constructor)
// Parameterized constructor


class Bike{

    String names;
    int model;


    // Constructor overloading
    Bike(String name){
        System.out.println(name);
    }
// this keyword - Used to refer any properties inside a class.
    Bike(int model, String name){
      this.names=name;
      this.model=model;
    }

    Bike(){

    }


    public static String returnName(String name){
        return name.toLowerCase();
    }

    public int returnModel(){
        return 2022;
    }
}
