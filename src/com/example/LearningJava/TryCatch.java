package com.example.LearningJava;

public class TryCatch {

    public static void main(String[] args){

        String w = "Welcome!";
        char[] c = w.toCharArray();

        /**
         * Here code is written in the try statement and
         * when any error is found in the try block the
         * error is then sent to the catch block and shown
         * with printStackTrace.
         */
        try {
            char lc = c[c.length];
            System.out.println(lc);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            e.printStackTrace();
        }


    }

}
