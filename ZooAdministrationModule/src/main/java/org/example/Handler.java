package org.example;

public class Handler extends Person {

    public Handler(String name, String location) {
        super(name, location);
    }

    public void Feed(String animalName) {
        System.out.println(getName() + " is feeding " + animalName);
    }

    public void Exercise(String animalName){
        System.out.println(getName() + " is exercising " + animalName);
    }

    public void Examine(String animalName){

        System.out.println(getName() + " is examining " + animalName);
    }

    @Override
    public String toString(){

        return "Handler - " + super.toString();

    }

}
