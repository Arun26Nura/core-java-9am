package com.besant.classes;

class Car{
    static class Honda{
        public  void name(){
            System.out.println("Inside Inner class");
        }

    }
    class Tata{
        public  void name(){
            System.out.println("Inside Inner class");
        }

        class Nano{
            public void model(){
                System.out.println("Nano");
            }
        }
    }
    class Suzuki{
        public static void name(){
            System.out.println("Inside Inner class");
        }
    }

    public void model(){
        System.out.println("Model");
    }


}
class FourWheeler extends Car{

}

public class InnerClassDemo {
    public static void main(String[] args) {

        // Both class and method non-static
        Car car= new Car();
        Car.Tata tata= car.new Tata();
        Car.Tata.Nano nano= tata.new Nano();
        tata.name();
        nano.model();

        // Inner class is static
        Car.Honda honda= new Car.Honda();
        honda.name();

        // Inner class method is static
        Car.Suzuki.name();

        FourWheeler fourWheeler= new FourWheeler();


    }
}
