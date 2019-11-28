package com.example.LearningJava;

public class Throw {

    public static void main(String[] args){

        String w = "Welcome!";
        char[] c = w.toCharArray();

        /**
         * Here you can generate your own exception with
         * custom message with the help of throw. The
         * exception is then thrown to the catch block
         * and printed.
         */
        try {

            if (c.length < 10){
                throw (new Exception("My custom message"));
            }
            char lc = c[c.length - 1];
            System.out.println(lc);

            String sub = w.substring(10);
            System.out.println("Substring: " + sub);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index problem!");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("String index problem!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
