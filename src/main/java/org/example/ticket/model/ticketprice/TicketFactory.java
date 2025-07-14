package org.example.ticket.model.ticketprice;

import java.util.Random;

import org.example.ticket.model.Ticket;
import org.example.ticket.model.Visitor;

public class TicketFactory {
    public static Ticket createTicket(Visitor visitor) {
        TicketPricingStrategy strategy;
        int age = visitor.getAge();

        if (age >= 0 && age <= 5) {
            strategy = new ChildTicketStrategy();
        } else if (age >= 6 && age <= 17) {
            strategy = new StudentTicketStrategy();
        } else if (age >= 18 && age <= 59) {
            strategy = new AdultTicketStrategy();
        } else {
            strategy = new SeniorTicketStrategy();
        }

        String code = "ZOO-" + (1000 + new Random().nextInt(9000));
        return new Ticket(code, strategy.getType(), strategy.getPrice());
    }
}