package com.example.LearningJava.model;

public enum OliveName {

    /**
     * These are enums.
     */
    KALAMATA("Kalamata"), LION("Lion");

    private String name;

    OliveName(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

}
