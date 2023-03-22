package com.besant.programs.operators;

import java.util.Scanner;

/**
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 * Test Data
 * Input a degree in Fahrenheit: 212
 * Expected Output:
 * 212.0 degree Fahrenheit is equal to 100.0 in Celsius.
 */
public class TemperatureConversion {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input Temp: ");
       double inputTemp= scanner.nextDouble();  // 2.12 divide

      double celsius= inputTemp /2.12;
        System.out.println(celsius);

        scanner.close();


    }
}
