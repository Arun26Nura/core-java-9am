package com.besant.design;

import java.util.ArrayList;
import java.util.List;

class MotorBike implements Cloneable{

    private List<String> bikeList;

    public List<String> getBikeList() {
        return bikeList;
    }
    public void addBike(String bike) {
        this.bikeList.add(bike);
    }

    public MotorBike(List<String> bikeList){
        this.bikeList= bikeList;
    }

    public MotorBike(){
        this.bikeList= new ArrayList<>();
    }


    @Override
    public MotorBike clone() {
        List<String> tempList= new ArrayList<>();
        tempList.addAll(this.bikeList);
        return new MotorBike(tempList);
    }
}
public class BuilderPattern{
    public static void main(String[] args) {
        MotorBike a= new MotorBike();
        a.addBike("yamaha");

        MotorBike b= a.clone();
        b.addBike("Pulsor");

        MotorBike c= b.clone();

    }
}