package org.example.models.buildings;

public class Tickets extends Shops {
    public Tickets() {
        super("Ticket Booth");
    }

    @Override
    public void enter() {
        System.out.println("You entered the Ticket Booth.");
    }
}
