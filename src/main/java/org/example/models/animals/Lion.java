package org.example.models.animals;

public class Lion extends Feline {
    public Lion(String name, String location) {
        super(name, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars.");
    }
}
