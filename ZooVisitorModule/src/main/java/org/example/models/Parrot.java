package org.example.models;

public class Parrot extends Bird {
    public Parrot(String location) {
        super("Parrot", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot sings.");
    }
}
