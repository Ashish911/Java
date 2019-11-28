package com.example.LearningJava;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s1 = sc.nextLine();
        int mn = Integer.parseInt(s1);

        switch (mn){
            case 1:
                System.out.println("The Month is January");
                break;
            case 2:
                System.out.println("The Month is February");
                break;
            case 3:
                System.out.println("The Month is March");
                break;
            default:
                System.out.println("You chose another month");
        }

        /*For strings*/
        System.out.print("Enter a string: ");
        String s2 = sc.nextLine();
        switch (s2){
            case "Jan":
                System.out.println("The month is 1");
                break;
            case "Feb":
                System.out.println("The month is 2");
                break;
            case "Mar":
                System.out.println("The month is 3");
                break;
            default:
                System.out.println("Dont Know");
        }
    }

}
