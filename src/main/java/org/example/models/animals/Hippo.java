package org.example.models.animals;

public class Hippo extends Pachyderm {
    public Hippo(String name, String location) {
        super(name, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " grunts.");
    }
}
