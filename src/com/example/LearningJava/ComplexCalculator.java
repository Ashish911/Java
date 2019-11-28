package com.example.LearningJava;

import com.example.LearningJava.utilities.MathHelper;

import java.util.Scanner;

public class ComplexCalculator {

    public static void main(String[] args){
        /*Creating of nested and anonymous classes*/
        ComplexCalculator calc = new ComplexCalculator();
        calc.Calculate();
    }

    protected void Calculate() {
        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Enter the first number: ");
        String s2 = helper.getInput("Enter the second number: ");
        String s3 = helper.getInput("Select operator + - / * :");

        double result = 0;

        try {
            switch (s3) {
                case "+":
                    result = MathHelper.AddValues(s1,s2);
                    System.out.println(result);
                    break;
                case "-":
                    result = MathHelper.SubtractValues(s1,s2);
                    System.out.println(result);
                    break;
                case "/":
                    result = MathHelper.DivideValues(s1,s2);
                    System.out.println(result);
                    break;
                case "*":
                    result = MathHelper.MultiplyValues(s1,s2);
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Unrecognised Operation");
            }
        } catch (Exception e){
            System.out.println("Number formatting exception: " + e.getMessage());
        }
    }

    /*Nested Class*/
    class InputHelper{
        private String getInput(String input){
            System.out.println(input);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }


}
