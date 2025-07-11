package org.example.model.ticketprice;

public class ChildTicketStrategy implements TicketPricingStrategy {
    @Override
    public String getType() {
        return "Child";
    }

    @Override
    public double getPrice() {
        return 0.00;
    }
}