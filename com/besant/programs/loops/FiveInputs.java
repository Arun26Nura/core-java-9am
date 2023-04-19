package com.besant.programs.loops;

import java.util.Scanner;

/**
 * Write a program in Java to input 5 numbers from keyboard and find their sum and
 * average.
 * Test Data
 * Input the 5 numbers : 1 2 3 4 5
 * Expected Output :
 * Input the 5 numbers :
 * 1
 * 2
 * 3
 * 4
 * 5
 * The sum of 5 no is : 15
 * The Average is : 3.0
 */
public class FiveInputs {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter the "+ i+ " input");
            int input= scanner.nextInt();
            sum+=input;
        }
        System.out.println(sum);
        System.out.println(sum/5);

        int number=4;
        int cube= number*number*number;


    }
}
