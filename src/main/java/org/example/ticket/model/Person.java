package org.example.ticket.model;

public abstract class Person {
    private String name;
    private String location;

    public Person(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void goTo(String location) {
        this.location = location;
    }
}