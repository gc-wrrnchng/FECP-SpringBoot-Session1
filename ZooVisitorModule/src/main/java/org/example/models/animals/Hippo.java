package org.example.models.animals;

public class Hippo extends Pachyderm {
    public Hippo(String location) {
        super("Hippo", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Hippo grunts.");
    }
}
