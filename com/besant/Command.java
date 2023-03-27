package com.besant;

public class Command {
    public static void main(String[] args) {
      int m=11;
      int n=5;

      int index=0;
      for(int i=m; i<231;i++){
          int input=i;
          int reversedNumber=0;
          while (input>0){
              int temp= input%10;
              reversedNumber= reversedNumber*10+temp;
              input/=10;
          }
          if(i == reversedNumber){
             index++;
          }
          if(index==n){

              System.out.println(i);
              break;
          }







      }





    }
}
