package com.example.LearningJava;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {

    public static void main(String[] args){

        Locale L = new Locale("da","DK");

        double db = 1_234_567.89;

        NumberFormat NF = NumberFormat.getNumberInstance(L);
        System.out.println("Number: " + NF.format(db));

        NumberFormat CF = NumberFormat.getCurrencyInstance(L);
        System.out.println("Currency: " + CF.format(db));

        NumberFormat IF = NumberFormat.getIntegerInstance(L);
        System.out.println("Integer: " + IF.format(db));

    }
}
