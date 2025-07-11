package org.example.models;

public class Cheetah extends Feline {
    public Cheetah(String location) {
        super("Cheetah", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Cheetah purrs.");
    }
}
