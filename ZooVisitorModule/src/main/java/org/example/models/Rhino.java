package org.example.models;

public class Rhino extends Pachyderm {
    public Rhino(String location) {
        super("Rhino", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Rhino bellows.");
    }
}
