package org.example;

public class Handler extends Person {

    public Handler(String name, String location) {
        super(name, location);
    }

    public void Feed(String animalName) {
        System.out.println(getName() + " is feeding " + animalName);
    }

}
