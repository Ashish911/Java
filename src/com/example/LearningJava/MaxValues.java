package com.example.LearningJava;

public class MaxValues {

    public static void main(String[] args){
/**
 * Here Byte is a helper object of byte data type. The same
 * goes to Integer.
 */
        byte b = 127;
        System.out.println("Byte: " + b);

        if (b <Byte.MAX_VALUE) {
            b++;
        }
        System.out.println("Byte: " + b);

        int i = 100;
        System.out.println("Integer: " + i);

        if (i <Integer.MAX_VALUE){
            i++;
        }
        System.out.println("Integer: " + i);
    }

}
