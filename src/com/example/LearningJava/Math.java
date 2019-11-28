package com.example.LearningJava;

public class Math {

    public static void main(String[] args){

        int intvalue1 = 56;
        int intvalue2 = 45;

        int result1 = intvalue1 + intvalue2;
        System.out.println("Addition: " + result1);

        int result2 = intvalue1 - intvalue2;
        System.out.println("Subtraction: " + result2);

        int result3 = intvalue1 * intvalue2;
        System.out.println("Multiplication: " + result3);

        double result4 = (double)intvalue1 / intvalue2;
        System.out.println("Division: " + result4);

        double result5 = (double) intvalue1 % intvalue2;
        System.out.println("Remainder: " + result5);

        double db = -3.9999;
        /**
         * Here Math is a class of java.lang which is used
         * to run many methods. Here it is used
         * to find the round of a long value and in the same
         * way absolute value is found. Instantiating is not
         * needed for math classes.
         */
        long rounded = java.lang.Math.round(db);
        System.out.println("Rounded: " + rounded);

        double absv = java.lang.Math.abs(db);
        System.out.println("Absolute: " + absv);
    }
}
