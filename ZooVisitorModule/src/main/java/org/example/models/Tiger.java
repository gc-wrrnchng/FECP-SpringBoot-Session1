package org.example.models;

public class Tiger extends Feline {
    public Tiger(String location) {
        super("Tiger", location);
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger growls.");
    }
}
