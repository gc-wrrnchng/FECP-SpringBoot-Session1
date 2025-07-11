package org.example.models.animals;

public abstract class Animal {
    public boolean healthy;
    public String name;

    public Animal(String name) {
        this.name = name;
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

    public abstract void makeSound();

    public abstract void roam();
}
