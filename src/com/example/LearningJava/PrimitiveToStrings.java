package com.example.LearningJava;

import java.text.NumberFormat;

public class PrimitiveToStrings {

    public static void main(String[] args){

        /**
         * Here with the help of helper classes value are
         * changed into desirable data types.
         */
        int i = 42;
        String fi = Integer.toString(i);
        System.out.println(fi);

        boolean b = true;
        String fb = Boolean.toString(b);
        System.out.println(fb);

        /**
         * Here number format is a class which is used to
         * change the long value into a string values with
         * commas as separaters.
         */
        long l = 10_000_000;
        NumberFormat formater = NumberFormat.getNumberInstance();
        String fl = formater.format(l);
        System.out.println(fl);
    }
}
