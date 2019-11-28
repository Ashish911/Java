package com.example.LearningJava;

public class MultiCatch {

    public static void main(String[] args){

        String w = "Welcome!";
        char[] c = w.toCharArray();

        /**
         * If any particular exception is found accourding
         * to that exception the required catch block is
         * used with the error shown.
         */
        try {
            char lc = c[c.length - 1];
            System.out.println(lc);

            String sub = w.substring(10);
        } catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
            System.out.println("Array index problem!");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("String index problem!");
        }

    }
}
