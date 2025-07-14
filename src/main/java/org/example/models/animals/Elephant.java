package org.example.models.animals;

public class Elephant extends Pachyderm {
    public Elephant(String location) {
        super("Elephant", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets.");
    }
}
