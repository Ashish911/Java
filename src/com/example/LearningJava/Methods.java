package com.example.LearningJava;

public class Methods {

    static String[] m = {"January","February","March",
            "April","May","June","July","August",
            "September","October","November",
            "December"};

    public static void  main(String[] args){
        LoopIt("Hello");
        LoopIt("Jello");
        LoopIt("asdasdasd");
    }

    /**
     * Here having void there is no return type for this
     * method.
     * @param label
     */
    static void LoopIt(String label){

        System.out.println(label);
        for (int i = 0; i < label.length() ; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }

}
