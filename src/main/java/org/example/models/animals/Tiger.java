package org.example.models.animals;

public class Tiger extends Feline {
    public Tiger(String name, String location) {
        super(name, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " growls.");
    }
}
