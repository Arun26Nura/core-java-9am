package com.besant.programs.operators;

/**
 * Write a Java program to break an integer into a sequence of individual digits.
 * Test Data
 * Input six non-negative digits: 123456
 * Expected Output :
 * 1 2 3 4 5 6
 */
public class BreakNumbers {
    public static void main(String[] args) {
        int input = 12321;
        int reversedNumber=0;
        while (input > 0){
            int remainder= input%10;
            reversedNumber= reversedNumber*10+remainder;
            input/=10;
        }

        while (reversedNumber > 0) {
            int remainder= reversedNumber%10;
            reversedNumber/=10;
            System.out.print(remainder);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(reversedNumber==input);


    }
}
