package com.example.LearningJava;

import java.util.List;

public class ArrayList {

    public static void main(String[] args){

        /*Array lists can be known as resizable array*/
        List<String> list = new java.util.ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state = list.get(1);

        System.out.println("The second state is " + state);

        int pos = list.indexOf("Alaska");
        System.out.println(pos);

    }

}
