package com.example.LearningJava;

public class MultiArrays {

    public static void main(String[] args){

        /**
         * These are multi dimensional arrays or a 2 dimensional array.
         * Here there are a total of 3 items where each item has 2 sub item.
         */
        String[][] states = new String[3][2];
        states[0][0] = "California";
        states[0][1] = "Sacramento";
        states[1][0] = "Oregon";
        states[1][1] = "Salem";
        states[2][0] = "Washington";
        states[2][1] = "Olympia";

        for (int i = 0; i < states.length ; i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("The capital of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1])
                    .append(".");
            System.out.println(sb);
        }

    }

}
