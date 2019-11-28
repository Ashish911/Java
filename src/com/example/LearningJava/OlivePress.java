package com.example.LearningJava;

import com.example.LearningJava.model.Olive;

import java.util.List;

public class OlivePress {

    public int getOil(List<Olive> Olives){

        int totalOil = 0;
        for (Olive o : Olives){
            System.out.println(o.getName());
            totalOil += o.crush();
        }
        return totalOil;

    }

}
