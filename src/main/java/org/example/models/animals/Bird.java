package org.example.models.animals;

import org.example.models.buildings.Enclosures;

public class Bird extends Animal {
    private String location;
    private Enclosures<? extends Bird> enclosure;

    public Bird(String name, Enclosures<? extends Bird> enclosure) {
        super(name, enclosure);
        this.enclosure = enclosure;
        this.location = enclosure != null ? enclosure.getName() : "Unknown";
    }

    public Bird(String name, String location) {
        super(name, null);
        this.location = location;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating seeds.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    @Override
    public void roam() {
        if (enclosure != null) {
            System.out.println(getName() + " is flying around the " + enclosure.getName() + ".");
        } else {
            System.out.println(getName() + " is flying around in the " + location + ".");
        }
    }
}
