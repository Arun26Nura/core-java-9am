package com.besant.control;

public class DecisionStatement {

    public static void main(String[] args) {
// for-loop  =  1 to 200  1 to 200, 20 - 40
        //while
        //do-while

        for(int i=0;i<5;i++){  // 0 1 2 3 4
            System.out.println(i);
            break; // used to stop the loop
            // continue - Skip the current
            // - Answer
            //
            //

            //
        }

        // n=10;
        int n=1;
        while(n < 5){  // 1 2 3 4 // true
            System.out.println(n++);
        }

        int m=0;
        do {
            System.out.println(m);
        }
        while (m !=0);


    }
}
