package com.example.LearningJava;

import com.example.LearningJava.model.Olive;
import com.example.LearningJava.model.OliveName;

import java.util.ArrayList;
import java.util.List;

public class InstanceVariables {

    public static void main(String[] args){

        List<Olive> Olives = new ArrayList<>();
        Olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
        Olive Olive2 = new Olive(OliveName.KALAMATA, 0x2E0854, 3);
        Olive2.setOil(1);
        Olives.add(Olive2);
        Olive Olive3 = new Olive(OliveName.LION, 0x000000, 2);
        Olive3.setOil(4);
        Olives.add(Olive3);

        OlivePress Press = new OlivePress();
        Press.getOil(Olives);
        int totalOil = Press.getOil(Olives);
        System.out.println("Total olive oil: " + totalOil);

    }
}
