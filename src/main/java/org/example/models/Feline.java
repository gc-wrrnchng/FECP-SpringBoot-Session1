package org.example.models;

public abstract class Feline extends Animal {
    protected String location;

    public Feline(String name, String location) {
        super(name);
        this.location = location;
    }

    @Override
    public void roam() {
        System.out.println(name + " is moving about in the " + location + ".");
    }
}
