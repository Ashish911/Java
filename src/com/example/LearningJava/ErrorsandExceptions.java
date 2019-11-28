package com.example.LearningJava;

public class ErrorsandExceptions {

    public static void main(String[] args){

        String s = null;

        System.out.println(s);

        String w = "Welcome!";
        char[] chars = w.toCharArray();
        char lc = chars[chars.length - 1];
        System.out.println(lc);

    }
}
