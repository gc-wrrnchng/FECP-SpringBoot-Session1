package org.example.model.ticketprice;

public class StudentTicketStrategy implements TicketPricingStrategy {
    @Override
    public String getType() {
        return "Student";
    }

    @Override
    public double getPrice() {
        return 75.00;
    }
}