package org.example.models.animals;

import org.example.models.buildings.Enclosures;

public class Pachyderm extends Animal {
    private String location;
    private Enclosures<? extends Pachyderm> enclosure;

    public Pachyderm(String name, Enclosures<? extends Pachyderm> enclosure) {
        super(name, enclosure);
        this.enclosure = enclosure;
        this.location = enclosure != null ? enclosure.getName() : "Unknown";
    }

    public Pachyderm(String name, String location) {
        super(name, null);
        this.location = location;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating plants.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    @Override
    public void roam() {
        if (enclosure != null) {
            System.out.println(getName() + " is walking around the " + enclosure.getName() + ".");
        } else {
            System.out.println(getName() + " is roaming in the " + location + ".");
        }
    }
}
