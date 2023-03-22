package com.besant.programs.operators;

import java.util.Scanner;

/**
 * Write a Java program to convert minutes into number of years and days.
 * Test Data
 * Input the number of minutes: 3456789
 * Expected Output :
 * 3456789 minutes is approximately 6 years and 210 days
 */
public class MinutesTodays {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input : ");
        long minutes= scanner.nextLong();
        long hours= minutes /60;
        long days= hours/24;

        long years= days/365;
        long remainingdays= days%365;
        System.out.println(years + "Years : "+ remainingdays +" days");


    }
}
