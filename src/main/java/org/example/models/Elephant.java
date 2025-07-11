package org.example.models;

public class Elephant extends Pachyderm {
    public Elephant(String location) {
        super("Elephant", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets.");
    }
}
