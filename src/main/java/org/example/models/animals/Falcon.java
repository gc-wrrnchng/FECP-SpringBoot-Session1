package org.example.models.animals;

public class Falcon extends Bird {
    public Falcon(String name, String location) {
        super(name, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " squawks.");
    }
}
