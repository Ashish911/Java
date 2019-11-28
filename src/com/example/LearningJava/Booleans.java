package com.example.LearningJava;

public class Booleans {

    static boolean bdef;

    public static void main(String[] args){

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is " + b1);
        System.out.println("The value of b2 is " + b2);
        System.out.println("The value of bdef is " + bdef);

        boolean b3 = !b1;
        System.out.println("The value of b3 is " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("The value of b4 is " + b4);

        /*Needs to be true or false*/
        String  sbol = "true";

        /**
         * Here a string value is converted into boolean
         * with the help of the Boolean Helper Class.
         */
        boolean b5 = Boolean.parseBoolean(sbol);
        System.out.println("The value of b5 is " + b5);
    }
}
