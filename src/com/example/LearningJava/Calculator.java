package com.example.LearningJava;

import java.util.Scanner;

public class Calculator {

    public  static  void  main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        String i1 = scanner.nextLine();
        double d1 = Double.parseDouble(i1);

        System.out.print("Enter 2nd Value: ");
        String i2 = scanner.nextLine();
        double d2 = Double.parseDouble(i2);

        double r1 = d1 + d2;
        System.out.println("Addition is: " + r1);
        double r2 = d1 - d2;
        System.out.println("Subtraction is: " + r2);
        double r3 = d1 * d2;
        System.out.println("Multiplication is: " + r3);
        double r4 = d1 / d2;
        System.out.println("Division is: " + r4);
        double r5 = d1 % d2;
        System.out.println("Remainder is: " + r5);

    }
}
