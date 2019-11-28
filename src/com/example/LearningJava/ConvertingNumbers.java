package com.example.LearningJava;

public class ConvertingNumbers {

    public static void main(String[] args){

        /**
         * Converting a type which uses smaller memory to the
         * type that uses larger it is widening and when the
         * opposite is done it is called narrowing. Widening
         * is automatic but in narrowing special syntax are
         * needed.
         */
         int intValue1 = 56;
         int intValue2 = intValue1;
         System.out.println("Second value is: " + intValue2);
        /*Widening*/
         long longValue1 = intValue1;
        System.out.println("Long value is: " + longValue1);
        /*Narrowing*/
        /**
         * here (short) is a special syntax which converts a
         * int value to a short value. The same is done to byte
         * and int.
         */
        short shortValue1 = (short) intValue1;
        System.out.println("Short value is: " + shortValue1);
        /*Narrowing*/
        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("Byte value is: " + byteValue);
        /*Narrowing*/
        double doubleValue = 3.999999d;
        int inValue4 = (int) doubleValue;
        System.out.println("Integer value is: " +inValue4);
    }
}
