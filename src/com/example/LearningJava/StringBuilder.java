package com.example.LearningJava;

import java.util.Scanner;

public class StringBuilder {

    public static void main(String[] args){

        String s1 = "Hello";
        String s2 = "World";
        /*Can cause problems in memory management*/
        String s3 = s1 + ", " + s2 + "!";
        System.out.println(s3);

        /*Using for better memory management*/
        /**
         * StringBuilder is used to append strings without
         * the use of many objects or variables.
         */
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello")
        .append(", ")
        .append("World")
        .append("!");
        System.out.println(sb);

        /**
         * A scanner is used to take the input of user. Here
         * system . in inputs to the console which system.out
         * outputs to the console.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());

        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }

        System.out.println(sb);
    }
}
