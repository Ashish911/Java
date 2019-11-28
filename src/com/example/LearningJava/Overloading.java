package com.example.LearningJava;

import java.util.Scanner;

public class Overloading {

    public static void  main(String[] args){
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        double result = addValues(s1,s2);
        double result2 = addValues(s1,s2,s3);
        double result3 = addValues(s1,s2,s3,s1,s2,s3);
        System.out.println("The answer of 2 values is: " + result);
        System.out.println("The answer of 3 values is: " + result2);
        System.out.println("The answer of many values is: " + result3);
    }

    static String getInput(String prompt){
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return  sc.nextLine();
    }

    /**
     * Here method overloading is performed where there
     * are 3 methods with the same name but having different
     * no of arguements or the data type of the arguements.
     * In the first method there are 2 args while in the 2nd
     * there are 3 this is called method overloading.
     * @param s1
     * @param s2
     * @return
     */
    static  double addValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }
    static  double addValues(String s1, String s2, String s3){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double result = d1 + d2 + d3;
        return result;
    }

    static double addValues(String ... values){
        double result = 0;
        for (String value : values){
            double d = Double.parseDouble(value);
            result +=d;
        }
        return result;
    }
}
