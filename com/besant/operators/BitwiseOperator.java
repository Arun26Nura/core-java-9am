package com.besant.operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        int number=-5;
         int negate = ~number;  // Negate ~
        System.out.println(negate);

        // Binary AND &
        System.out.println(5 & 6);

        // Binary OR |
        System.out.println(5 | 6);

        // Binary XOR ^
        System.out.println(5 ^ 6);
        // Left Sfift Operator
        System.out.println(1 << 2);
        // Signed Right Shift
        System.out.println(-8 >> 2);//1
        // UnSigned Right Shift
        System.out.println(-8 >>> 2);//0




    }
}
