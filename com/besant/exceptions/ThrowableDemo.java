package com.besant.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowableDemo {
    public static void main(String[] args) throws SimpleException{

          //  readFile();

            cityName("Bangalpre");

    }

    public static void readFile() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\arunk\\OneDrive\\Desktop\\arun-documents\\j2ee-notes.txt");


    }

    public static void cityName(String city) throws SimpleException{
        if(city.equals("Chennai")){
            throw new SimpleException("City Name is Chennai");
        }
    }

}
