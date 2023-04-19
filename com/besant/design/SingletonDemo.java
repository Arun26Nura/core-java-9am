package com.besant.design;

class Car{

    private static Car car= new Car();
    private Car(){

    }
    public  static Car getInstance(){
        // t2 t1,
        return car;
    }

}
public class SingletonDemo {
    public static void main(String[] args) {
        Car car1= Car.getInstance();
        Car car2= Car.getInstance();
        System.out.println(car1);
        System.out.println(car2);
    }
}
