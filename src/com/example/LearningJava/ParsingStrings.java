package com.example.LearningJava;

public class ParsingStrings {

    public static void main(String[] args){

        String s1 = "Welcome to Nepal";
        System.out.println("Length of string: " + s1.length());

        int p = s1.indexOf("Nepal");
        System.out.println("Position of substring: " + p);

        String sub = s1.substring(11);
        System.out.println(sub);

        String s2 = "Welcome!       ";
        int Len = s2.length();
        System.out.println(Len);
        String s3 = s2.trim();
        System.out.println(s3.length());

    }
}
