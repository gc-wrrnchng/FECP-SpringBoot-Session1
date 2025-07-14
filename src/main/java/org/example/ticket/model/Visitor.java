package org.example.ticket.model;

public class Visitor extends Person{
    private final int age;
    
    public Visitor(String name, String location, int age) {
        super(name, location);
        this.age = age;
    }
    
    public Visitor(String name, int age) {
        super(name, "Ticket Shop");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
