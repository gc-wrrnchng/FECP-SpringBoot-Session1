package org.example;

public abstract class Animal {
    private String name;
    private String enclosure;
    private boolean healthy;


    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
    public abstract void roam();

    public Animal(String name, String enclosure){
        this.name = name;
        this.enclosure = enclosure;
        this.healthy = true;
    }

    public String getName(){
        return name;
    }

    public String getEnclosure(){
        return enclosure;

    }

    public boolean isHealthy(){
        return healthy;
    }

    public void setHealthy(boolean healthy){
        this.healthy = healthy;


    }




}
