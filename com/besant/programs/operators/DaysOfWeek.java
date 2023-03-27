package com.besant.programs.operators;

/**
 * Write a Java program that keeps a number from the user and generates an integer
 * between 1 and 7 and displays the name of the weekday.
 * Test Data
 * Input number: 3
 * Expected Output :
 * Wednesday
 */
public class DaysOfWeek {
    public static void main(String[] args) {

        int year=2016;
        int mmonth=3;
      switch (mmonth){
           case 1,3,5,7,9,10,12 -> System.out.println("31 days");
           case 4, 6,8,11 -> System.out.println("30 days");
           case 2 ->{
               if(year%4==0){
                   if (year % 100 == 0) {
                       if(year%400== 0)
                           System.out.println("29 days");
                       else{
                           System.out.println("28 days");
                       }
                   }else {
                       System.out.println("29 days");
                   }
               }else{
                   System.out.println("28 days");
               }
           }
      };

    }
}
