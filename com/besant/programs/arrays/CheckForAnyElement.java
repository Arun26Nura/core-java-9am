package com.besant.programs.arrays;

import java.util.List;

public class CheckForAnyElement {
    public static void main(String[] args) {
        int[] arrays= {1,4,56,2};  // 2
        for(int val: arrays){
            if(val==2){
                System.out.println("TRUE");
                break;
            }
        }

        List<Integer> integerList= List.of(43,24,24,2); // 23


        // Streams API
        // Pipelines to work on the collection libraries

        // Intermediate  - Stream of data
        // filter

        // Terminal functions - Not return stream of data
        // AnyMatch
        //NoneMatch
        //AllMatch

       Boolean anyMatch= integerList.stream().anyMatch(integer -> integer.equals(2));




    }
}
