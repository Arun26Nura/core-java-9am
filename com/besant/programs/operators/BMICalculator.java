package com.besant.programs.operators;

import java.util.Scanner;

/**
 * Write a Java program to compute body mass index (BMI).
 * Test Data
 * Input weight in pounds: 452
 * Input height in inches: 72
 * Expected Output:
 * Body Mass Index is 61.30159143458721
 */
public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input weight in kg : ");
        double weight= scanner.nextDouble();
        System.out.println("Enter the height in meters : ");
        double height= scanner.nextDouble();

        double bmi= weight/(height* height);
        System.out.println(bmi);
        //kg/m2
    }
}
