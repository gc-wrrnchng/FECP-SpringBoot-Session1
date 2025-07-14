package org.example.models.people;

public class Visitor extends Person {

    public Visitor(String name, String location) {
        super(name, location);
    }

    @Override
    public String toString() {
        return "Visitor - " + super.toString();
    }
}
