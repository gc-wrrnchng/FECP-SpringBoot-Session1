package org.example.models.buildings;

public class Drinks extends Shops {
    public Drinks() {
        super("Drinks");
    }

    @Override
    public void enter() {
        System.out.println("You entered the Drink store.");
    }
}
