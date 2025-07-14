package org.example.models.animals;

import org.example.models.buildings.Enclosures;

public class Feline extends Animal {
    private String location;
    private Enclosures<? extends Feline> enclosure;

    public Feline(String name, Enclosures<? extends Feline> enclosure) {
        super(name, enclosure);
        this.enclosure = enclosure;
        this.location = enclosure != null ? enclosure.getName() : "Unknown";
    }

    public Feline(String name, String location) {
        super(name, null);
        this.location = location;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " ROAR!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating meat.");
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
            System.out.println(getName() + " is moving about in the " + location + ".");
        }
    }
}
