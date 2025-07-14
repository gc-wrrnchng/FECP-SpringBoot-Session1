package org.example.models.animals;

public class Parrot extends Bird {
    public Parrot(String name, String location) {
        super(name, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " sings.");
    }
}
