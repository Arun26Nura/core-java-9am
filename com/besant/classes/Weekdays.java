package com.besant.classes;

public enum Weekdays{

    MONDAY(1,"Monday"),  //  Weekdays MONDAY = new Weekdays(1);
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    int days;
    Weekdays(int i,String day){
        days=i;
    }
    Weekdays(){

    }

}
 class EnumDemo{
     public static void main(String[] args) {
       Weekdays[] weekdays=  Weekdays.values();
         System.out.println( Weekdays.MONDAY.days);
        // monday.getDays();

         String name="Hello";

     }
 }
