package org.example.models.buildings;

import org.example.models.animals.Animal;

import java.util.List;
import java.util.ArrayList;

public abstract class Enclosure {
    private String name;
    private List<Animal> animals;

    public Enclosure(String name){
        this.name = name;
        this.animals = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }


}
