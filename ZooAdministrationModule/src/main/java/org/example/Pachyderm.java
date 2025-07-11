package org.example;

public class Pachyderm extends Animal {

    public Pachyderm(String name, String enclosure){
        super(name, enclosure);

    }
    @Override
    public void makeSound() {
        System.out.println(getName() + "Trumpets");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating plants.");
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
