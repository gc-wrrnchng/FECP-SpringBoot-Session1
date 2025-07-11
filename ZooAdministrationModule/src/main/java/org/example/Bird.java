package org.example;

public class Bird extends Animal{


    public Bird(String name, String enclosure) {
        super(name, enclosure);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "Chirps");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating seeds.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    @Override
    public void roam() {
        System.out.println(getName() + " is flying around the enclosure.");
    }
}
