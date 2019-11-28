package com.example.LearningJava;

public class StringClass {

    public static void main(String[] args){

        String s1 = "This is a string";
        System.out.println(s1);

        String s2 = "This is also a string";
        System.out.println(s2);

        String s3 = "Shirt Size: ";
        String s4 = "M";
        String s5 = s3 + s4 + ", Qty: " + 4;
        System.out.println(s5);

        /**
         * Here  char[] is a array of characters stored in
         * a variable. Then a String object is instantiated with
         * parameters as chars.
         */
        char[] chars = {'H','e','l','l','o'};
        String s6 = new String(chars);
        System.out.println(s6);

        /**
         * Here the string of s6 is converted into an array
         * of characters.
         */
        char[] chars2 = s6.toCharArray();
        for (char c : chars2) {
            System.out.println(c);
        }
    }
}
