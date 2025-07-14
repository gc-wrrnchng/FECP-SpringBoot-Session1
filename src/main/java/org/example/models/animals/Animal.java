package org.example.models.animals;

import org.example.admin.models.buildings.Enclosure;

public abstract class Animal {
    protected boolean healthy;
    protected String name;
    protected Enclosure enclosure;

    public Animal(String name, Enclosure enclosure) {
        this.name = name;
        this.enclosure = enclosure;
        this.healthy = true;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public boolean isHealthy() {
        return healthy;
    }

    public String getName() {
        return name;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public abstract void makeSound();

    public abstract void roam();
}
