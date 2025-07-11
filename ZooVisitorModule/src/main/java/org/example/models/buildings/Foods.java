package org.example.models.buildings;

public class Foods extends Shops {
    public Foods() {
        super("Foods");
    }

    @Override
    public void enter() {
        System.out.println("You entered the Food Store.");
    }
}
