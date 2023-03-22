package com.besant.arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // Arrays is a group of values of similar datatypes

        // Array Declaration.
        int[] numberArrays = new int[5];
        // Types of Array - Array Name = Object - Max Values
        numberArrays[0]=4;
        numberArrays[0]=18;
        numberArrays[1]=3;
        numberArrays[4]=3;


        System.out.println(numberArrays[2]);

        String[] cityList= {"Chennai","Pune","Delhi"};  //new String[]{"Chennai","Pune","Delhi"}

        Object[] objectList= {1,true,Long.valueOf("1"),"Hello"};
        int number=(int) objectList[0];


        // for -loop n=5 ; 0 to 4 (n-1) 0 < 5  // 2 to 4
                    //10  //5
        // 2- 6 - Size > 6 - 6
        int max= numberArrays.length > 6 ? 6 : numberArrays.length;
        for(int i=0; i < max;i++){
            numberArrays[i]=i*3;
        }
        // For- Each Loop
        for(int numb: numberArrays){
            System.out.println(numb);
        }


    }
}
