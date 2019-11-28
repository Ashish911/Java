package com.example.LearningJava;

public class Characters {

    public static void main(String[] args){

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Car 1: " + c1);
        System.out.println("Car 2: " + c2);
        System.out.println("Car 3: " + c3);

        char dollarsign = '\u0024';
        System.out.println("Currency : " + dollarsign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        /**
         * Here a Character class is used which is used
         * to uppercase the character value.
         */
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));
    }
}
