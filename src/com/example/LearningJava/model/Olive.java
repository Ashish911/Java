package com.example.LearningJava.model;

public class Olive {

    /*constant*/
    public static final String KALAMATA = "Kalamata";
    public static final String LION = "Lion";

    private OliveName name = OliveName.KALAMATA;
    private long color = 0x2E0854;
    private int oil = 3;

    /*1st Constructor is only used to satisfy compiler rule*/
    public Olive(){

    }

    public Olive(OliveName name, long color, int oil){
        this.name = name;
        this.color = color;
        this.oil = oil;
    }


    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int crush() {
        System.out.println("ouch!");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
