package com.besant.design;

class Truck{
    private static Truck truck;

    private Truck(){

    }

    public static Truck getInstance(){
        if(truck == null)
            truck= new Truck();

        return truck;
    }

}

public class Singleton {
    public static void main(String[] args) {
        Truck truck= Truck.getInstance();
        Truck truck2= Truck.getInstance();
        System.out.println(truck2);
        System.out.println(truck);
    }
}
