package org.example.models.animals;

public class Owl extends Bird {
    public Owl(String location) {
        super("Owl", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Owl hoots.");
    }
}
