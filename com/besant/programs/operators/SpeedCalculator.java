package com.besant.programs.operators;

import java.util.Scanner;

/**
 * Write a Java program to takes the user for a distance (in meters) and the time was
 * taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per
 * second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
 * Test Data
 * Input distance in meters: 2500
 * Input hour: 5
 * Input minutes: 56
 * Input seconds: 23
 * Expected Output :
 * Your speed in meters/second is 0.11691531
 * Your speed in km/h is 0.42089513
 * Your speed in miles/h is 0.26158804
 */
public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the distance in meters: ");
        float meters= scanner.nextInt();
        System.out.println("Enter the hour: ");
        float hour= scanner.nextInt();
        System.out.println("Enter the minutes: ");
        float minutes= scanner.nextInt();
        System.out.println("Enter the second: ");
        float seconds= scanner.nextInt();

        float totalSeconds= seconds + minutes*60 + hour*3600;

        float speedinMeterSeconds= meters/totalSeconds;
        System.out.println("Speed in m/s : "+speedinMeterSeconds );

        float km=meters/1000;
        float miles= meters/1609;
        float hours= totalSeconds/3600;
        float speedInKmperHour= km / hours;
        System.out.println("Speed in km/hr : "+speedInKmperHour );

        float speedInmilesPerHour=miles / hours;
        System.out.println("Speed in km/hr : "+speedInmilesPerHour );


    }
}
