package org.example.models.animals;

public abstract class Pachyderm extends Animal {
    protected String location;

    public Pachyderm(String name, String location) {
        super(name);
        this.location = location;
    }

    @Override
    public void roam() {
        System.out.println(name + " is roaming in the " + location + ".");
    }
}
