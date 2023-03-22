package com.besant.programs.operators;

import java.util.Scanner;

/**
 *  Write a Java program that reads a number in inches, converts it to meters.
 * Note: One inch is 0.0254 meters.
 * Test Data
 * Input a value for inch: 1000
 * Expected Output :
 * 1000.0 inch is 25.4 meters.
 */
public class InchesToMeters {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input : ");
        double input= scanner.nextDouble();  // Input in inches

        double resultinMeters= input* 0.0254;
        System.out.println(resultinMeters);
    }

}
