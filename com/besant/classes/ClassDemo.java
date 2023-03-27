package com.besant.classes;


//Access modifier class class-name{}
public class ClassDemo {

    // State and Behaviour

    // State - Variables
    String name;

    int value=20;

    // Behavior - methods inside a class.4
    public static void main(String[] args) {
       int result= addNumbers(1, 2, 3);


    }

    // Method Overloading

    private static int addNumbers(int i, int i1, int i2) {
        return 0;
    }



    private static int addNumbers(int i, String i1, String i2, int c) {
        return 0;
    }

    private static int addNumbers( String i1, int s,String i2, int c) {
        return 0;
    }

    // Method declaration
    // Method definition.
    public static int addNumbers(int firstNumber, int secondNumber){
        int result=0;
        if(firstNumber >0 && secondNumber >0)
            result=firstNumber+ secondNumber;
        return result;

    }

    public String returnCityName(){
        return "Chennai";
    }

    // 2 parameters - first String, second float -- return 'Boolean

    public boolean returnBoolean(String stringVal,float seocondVl){
        return false;
    }

    // 5 parameters  - first string, float, long, float , int  = not returning

    public void methodName(String one, Float two, long three, float four, int five){


    }





}



