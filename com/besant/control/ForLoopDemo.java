package com.besant.control;

public class ForLoopDemo {
    public static void main(String[] args) {
        // Loop statements to perform repated actions.

        // For -loop
        // for ( variable initialization; condititon for n number of times; increment operators or loop increments){
        // }
        // 1 to 10

        for(int i=1;i<=10;i++){
            if(i%2!=0)
                continue;

            System.out.println(i);

        }

        // while(true){
        // }
        int i=0;
        while(i <=10){
          //  System.out.println(i);
            i++;
        }

        int j=0;
        do {
            //System.out.println(j);
            j++;
        }while (j > 0  && j<=10);




    }
}
