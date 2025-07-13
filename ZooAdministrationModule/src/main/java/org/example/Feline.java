package org.example;

public class Feline extends Animal{
    public  Feline(String name, Enclosure enclosure){
        super(name, enclosure);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "ROAR!");
        System.out.println();
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating meat.");
        System.out.println();
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping.");
        System.out.println();
    }

    @Override
    public void roam() {
        System.out.println(getName() + " is walking around the enclosure.");
        System.out.println();
    }
}
