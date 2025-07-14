package org.example.models.animals;

import org.example.models.buildings.Enclosure;

public abstract class Animal {
    private String name;
    private Enclosure enclosure;
    private boolean healthy;


    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
    public abstract void roam();

    public Animal(String name, Enclosure enclosure){
        this.name = name;
        this.enclosure = enclosure;
        this.healthy = true;
    }

    public String getName(){
        return name;
    }

    public Enclosure getEnclosure(){
        return enclosure;

    }

    public boolean isHealthy(){
        return healthy;
    }

    public void setHealthy(boolean healthy){
        this.healthy = healthy;


    }




}
