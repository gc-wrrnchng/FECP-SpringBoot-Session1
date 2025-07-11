package org.example.models.buildings;

public class Gifts extends Shops {
    public Gifts() {
        super("Gifts");
    }

    @Override
    public void enter() {
        System.out.println("You entered the Gift Store.");
    }
}
