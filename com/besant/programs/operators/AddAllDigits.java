package com.besant.programs.operators;

import java.util.Scanner;

/**
 * Write a Java program that reads an integer between 0 and 1000 and adds all the
 * digits in the integer.
 * Test Data
 * Input an integer between 0 and 1000: 565
 * Expected Output :
 * The sum of all digits in 565 is 16
 */
public class AddAllDigits {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the input number: ");
        int input= scanner.nextInt();  // 565

        int sum=0;

        while(input > 0){
            sum += input%10;
            input /=10;
        }

        System.out.println(sum);
    }
}
