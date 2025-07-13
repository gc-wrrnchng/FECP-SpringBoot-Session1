package org.example;

public class Bird extends Animal{


    public Bird(String name, Enclosure enclosure) {
        super(name, enclosure);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "Chirps");
        System.out.println();
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating seeds.");
        System.out.println();
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
        System.out.println();
    }

    @Override
    public void roam() {
        System.out.println(getName() + " is flying around the enclosure.");
        System.out.println();
    }
}
