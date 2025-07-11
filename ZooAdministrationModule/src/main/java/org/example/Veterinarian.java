package org.example;

public class Veterinarian extends Person{


    public Veterinarian() {
        super("Unnamed Veterinarian", "Animal Hospital");
    }

    public Veterinarian(String name) {
        super(name, "Animal Hospital");
    }
    public Veterinarian(String name, String location) {
        super(name, location);
    }

    public void heal(String animalName){
        System.out.println(getName() + " is healing " + animalName +".");
        System.out.println(animalName +" is now healed.");
    }

    public void lecture(String animalName){
        System.out.println(getName() + " is giving a lecture on animal health.");
    }

    @Override
    public String toString(){
        return "Veterinarian - " + super.toString();
    }


}
