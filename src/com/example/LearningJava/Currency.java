package com.example.LearningJava;

import java.math.BigDecimal;

public class Currency {

    public static void main(String[] args){

        double value = .012;

        double pSum = value + value + value;

        System.out.println("Sum of primitives: " + pSum);

        /**
         * Here the value of double is converted into string
         * with the help of Double helper class. The same
         * way
         */
        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);

        /**
         * BigDecimal is instantiated with the keyword new
         * which is allocating of memory for the object.
         */
        BigDecimal bgValue = new BigDecimal(strValue);

        /**
         * here .add is a method of the object bgValue.
         */
        BigDecimal bSum = bgValue.add(bgValue).add(bgValue);

        System.out.println("Big Sum: " + bSum.toString());
    }
}
