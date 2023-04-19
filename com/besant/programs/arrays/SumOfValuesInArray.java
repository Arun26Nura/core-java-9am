package com.besant.programs.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class SumOfValuesInArray {
    public static void main(String[] args) {
        int[] arrays={1,4,2,4,254}; // 0 to n-1 0- 4
       // Arrays.stream(arrays).
        int sum=0;
        for(int i=0;i< arrays.length;i++){
            sum+=arrays[i];
        }
       sum=0;
        for(int val: arrays){
            sum+=val;
        }


        sum=0;
        List<Integer> integers= List.of(1,34,34,34,453,5);
        for(int i=0;i<integers.size();i++){
            if(integers.get(i) %2==0){
                System.out.println(integers.get(i));
            }
        }

        integers.stream().filter(integer -> integer%2==0).forEach(integer -> System.out.println(integer));
        sum=0;
        for(int val: integers ){
            sum+=val;
        }

        integers.forEach(integer -> System.out.println(integer));

        // Max values in a list

        integers.stream().min(Comparator.comparingInt(Integer::intValue)).get();


    }
}
