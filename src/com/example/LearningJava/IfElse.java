package com.example.LearningJava;

public class IfElse {

    public static void main(String[] args){

        int mn = 15;

        if (mn >= 1 && mn <= 3 ){
            System.out.println("Quarter 1");
        } else if (mn >= 4 && mn<= 6){
            System.out.println("Quarter 2");
        } else if (mn >= 7 && mn<= 9){
            System.out.println("Quarter 3");
        } else if (mn >= 10 && mn<= 12){
            System.out.println("Quarter 4");
        } else {
            System.out.println("Unknown Month!");
        }
    }
}
