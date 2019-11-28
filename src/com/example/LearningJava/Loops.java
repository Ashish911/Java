package com.example.LearningJava;

public class Loops {

    public static void main(String[] args){

        String[] m = {"January","February","March",
                "April","May","June","July","August",
                "September","October","November",
                "December"};
        /*Incrementing loop*/
//        for (int i = 0; i < m.length; i++) {
//            System.out.println(m[i]);
//        }
//        for (int i = m.length-1; i >= 0 ; i--) {
//            System.out.println(m[i]);
//        }

        /*For each loop*/
//        for (String month : m){
//            System.out.println(month);
//        }

        /*While Loop*/
//        int counter = 0;
//        while (counter < m.length){
//            System.out.println(m[counter]);
//            counter++;
//        }

        /*Do while Loop*/
        int counter = 0;
        do {
            System.out.println(m[counter]);
            counter++;
        } while (counter < m.length);

    }
}
