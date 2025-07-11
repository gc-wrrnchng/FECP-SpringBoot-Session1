package org.example.models.buildings;

import org.example.models.animals.Animal;
import java.util.*;

public abstract class Enclosures extends Buildings {
    protected List<Animal> animals;

    public Enclosures(String name, List<Animal> animals) {
        super(name);
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public void enter() {
        System.out.println("You entered the " + name + ".");
        for (Animal a : animals) {
            if (a.isHealthy()) {
                System.out.println("- " + a.getName() + " is here.");
            }
        }
    }
}
