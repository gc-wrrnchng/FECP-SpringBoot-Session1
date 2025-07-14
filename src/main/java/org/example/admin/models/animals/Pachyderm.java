package org.example.admin.models.animals;

import org.example.admin.models.buildings.Enclosure;

public class Pachyderm extends Animal {

    public Pachyderm(String name, Enclosure enclosure) {
        super(name, enclosure);

    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "Trumpets");
        System.out.println();
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating plants.");
        System.out.println();
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
        System.out.println();
    }

    @Override
    public void roam() {
        System.out.println(getName() + " is walking around the enclosure.");
        System.out.println();
    }
}
