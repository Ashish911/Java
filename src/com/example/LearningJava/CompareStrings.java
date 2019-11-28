package com.example.LearningJava;

public class CompareStrings {

    public static void main(String[] args){

        String s1 = "Hello";
        String s2 = "Hello";

        if (s1 == s2){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        String s3 = "hello";
        if (s1 == s3){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        String p1 = "Hello ";
        String p2 = "World";
        String s4 = p1 + p2;
        String s5 = "Hello World";
        /**
         * If == does not work you use the equals operator.
         * It gives accurate results.
         */
        if (s4.equals(s5)){
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
