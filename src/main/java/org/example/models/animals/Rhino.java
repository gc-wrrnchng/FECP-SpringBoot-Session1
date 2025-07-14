package org.example.models.animals;

public class Rhino extends Pachyderm {
    public Rhino(String name, String location) {
        super(name, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " bellows.");
    }
}
