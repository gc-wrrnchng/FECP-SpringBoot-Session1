package org.example.ticket.model.ticketprice;

public interface TicketPricingStrategy {
    String getType();

    double getPrice();
}
