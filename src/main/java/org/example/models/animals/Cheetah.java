package org.example.models.animals;

public class Cheetah extends Feline {
    public Cheetah(String name, String location) {
        super(name, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " purrs.");
    }
}
