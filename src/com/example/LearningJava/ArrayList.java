package com.example.LearningJava;

import java.util.List;

public class ArrayList {

    public static void main(String[] args){

        /**
         * Array lists implements list. Java.util.<> is a diamond operator.
         */
        /*Array lists can be known as resizable array*/
        List<String> list = new java.util.ArrayList<>();

        /**
         * Add method is used to add values in the list.
         */
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        /**
         * Remove method is used to delete values within the list.
         */
        list.remove(0);
        System.out.println(list);


        String state = list.get(1);

        System.out.println("The second state is " + state);

        int pos = list.indexOf("Alaska");
        System.out.println(pos);

    }

}
