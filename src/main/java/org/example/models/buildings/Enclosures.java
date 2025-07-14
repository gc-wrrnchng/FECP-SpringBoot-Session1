package org.example.models.buildings;

import org.example.admin.models.animals.Animal;
import java.util.*;

public abstract class Enclosures<T extends Animal> extends Buildings {
    protected List<T> animals = new ArrayList<>();

    public Enclosures(String name) {
        super(name);
    }

    public List<T> getAnimals() {
        return animals;
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void removeAnimal(T animal) {
        animals.remove(animal);
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
