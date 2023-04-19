package com.besant.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompileTimeExceptions {
    public static void main(String[] args) {

     try {
         System.out.println("Hellpo");
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\arun\\OneDrive\\Desktop\\arun-documents\\j2ee-notes.txt");
         System.out.println("Chennai");
         int i=1/0;

         //10 lines

      }catch(Exception exception){
         System.out.println("Chennai");
         exception.printStackTrace();
      }finally {
         System.out.println("Chennai");
     }

     // A -> B -> C  new C();





        // Try - catch - finally
        //try- risky codes or code potentially throws error
    }
}
