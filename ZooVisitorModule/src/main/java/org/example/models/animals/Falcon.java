package org.example.models.animals;

public class Falcon extends Bird {
    public Falcon(String location) {
        super("Falcon", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Falcon squawks.");
    }
}
