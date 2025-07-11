package org.example;

public class Veterinarian extends Person{

    public Veterinarian(String name, String location) {
        super(name, location);
    }

    public void heal(String animalName){
        System.out.println(getName() + " is healing " + animalName +".");
    }

    public void lecture(String animalName){
        System.out.println(getName() + " is giving a lecture on animal health.");
    }

    @Override
    public String toString(){
        return "Veterinarian - " + super.toString();
    }


}
