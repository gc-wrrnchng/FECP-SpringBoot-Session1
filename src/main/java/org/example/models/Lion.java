package org.example.models;

public class Lion extends Feline {
    public Lion(String location) {
        super("Lion", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars.");
    }
}
