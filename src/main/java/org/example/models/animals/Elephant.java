package org.example.models.animals;

public class Elephant extends Pachyderm {
    public Elephant(String name, String location) {
        super(name, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " trumpets.");
    }
}
