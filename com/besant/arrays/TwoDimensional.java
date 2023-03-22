package com.besant.arrays;

import java.util.Arrays;
import java.util.Date;

public class TwoDimensional {
    public static void main(String[] args) {
        int[][] numbers = new int[2][2];
        numbers[0][0]= 5;
        numbers[0][1]=10;

        System.out.println(numbers[0][1]);
        System.out.println(numbers[1][1]);

        String[][] cities ={
                {"Madurai","Trichy"},
                {"Nellore","Vijayawada"}
        };

        for(int i=0;i<cities.length;i++){
            String[] citylist= cities[i];
            for(int j=0;j<citylist.length;j++){
                System.out.print(citylist[j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        for(String[] city : cities){
            for(String cityName : city){
                System.out.println(cityName);
            }
        }





    }
}
