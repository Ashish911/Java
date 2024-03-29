package com.example.LearningJava;

import java.util.Map;

public class HashMap {

    public static void main(String[] args){

        /**
         * Here in map there is a key and a value. Hash map is a implementation
         * of interface map.
         */
        Map<String, String> map = new java.util.HashMap<>();
        map.put("California", "Sacramento");
        map.put("Kathmandu", "Bafal");
        map.put("Bhaktapur", "Thimi");
        System.out.println(map);

        map.put("Alaska","Juneau");
        System.out.println(map);

        String cap = map.get("Alaska");
        System.out.println(cap);

        map.remove("California");
        System.out.println(map);
    }
}
