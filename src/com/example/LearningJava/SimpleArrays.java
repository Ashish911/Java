package com.example.LearningJava;

import java.util.Arrays;

public class SimpleArrays {

    public static void main (String[] args){

        System.out.println("Array of primitives");
        /**
         * This is an array of integers.
         */
        int[] ints = {9,6,3};
        /*Sorting of arrays*/
        Arrays.sort(ints);
        for (int i = 0; i < ints.length ; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array of strings");
        String[] strings = {"Red","Green","Blue"};
        Arrays.sort(strings);
        for (String color: strings){
            System.out.println(color);
        }

        System.out.println("Setting an initial size");
        /**
         * the no of item available in array is 10. Here this gives a default
         * value of 0 to 1000.
         */
        int[] sized = new int[10];
        for (int i = 0; i < sized.length ; i++) {
            sized[i] = i * 100;
        }
        for (int value: sized){
            System.out.println(value);
        }

        System.out.println("Copying an Array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        for (int value: copied){
            System.out.println(value);
        }

    }

}
