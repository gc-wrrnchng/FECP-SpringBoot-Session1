package org.example;

public class Feline extends Animal{
    public  Feline(String name, String enclosure){
        super(name, enclosure);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "ROAR!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating meat.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    @Override
    public void roam() {
        System.out.println(getName() + " is walking around the enclosure.");
    }
}
