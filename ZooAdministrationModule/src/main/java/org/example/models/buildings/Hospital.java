package org.example.models.buildings;

import org.example.models.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Animal> admittedAnimals;

    public Hospital() {
        this.admittedAnimals = new ArrayList<>();
    }

    public void admitAnimal(Animal animal) {
        if (animal != null && !admittedAnimals.contains(animal)) {
            admittedAnimals.add(animal);
            System.out.println(animal.getName() + " has been admitted to the hospital.");
        } else {
            System.out.println(animal.getName() + " is already in the hospital.");
        }
    }

    public List<Animal> getAdmittedAnimals() {
        return admittedAnimals;
    }
}