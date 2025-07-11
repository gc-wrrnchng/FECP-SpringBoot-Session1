package org.example.models;

public abstract class Bird extends Animal {
    protected String location;

    public Bird(String name, String location) {
        super(name);
        this.location = location;
    }

    @Override
    public void roam() {
        System.out.println(name + " is flying around in the " + location + ".");
    }
}
