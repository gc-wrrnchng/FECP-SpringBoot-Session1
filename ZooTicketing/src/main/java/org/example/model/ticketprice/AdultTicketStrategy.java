package org.example.model.ticketprice;

public class AdultTicketStrategy implements TicketPricingStrategy {
    @Override
    public String getType() {
        return "Adult";
    }

    @Override
    public double getPrice() {
        return 150.00;
    }
}