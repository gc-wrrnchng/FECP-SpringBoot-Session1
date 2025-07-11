package org.example.model.ticketprice;

public class SeniorTicketStrategy implements TicketPricingStrategy {
    @Override
    public String getType() {
        return "Senior";
    }

    @Override
    public double getPrice() {
        return 50.00;
    }
}