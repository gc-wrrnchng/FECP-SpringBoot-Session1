package org.example.models;

public class Falcon extends Bird {
    public Falcon(String location) {
        super("Falcon", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Falcon squawks.");
    }
}
