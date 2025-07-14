package org.example;

import org.example.admin.models.modules.AdminMenu;
import org.example.admin.models.modules.Zoo;
import org.example.modules.ZooSystem;
import org.example.ticket.TicketSystem;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        AdminMenu AdminMenu = new AdminMenu(zoo);
        if (AdminMenu.start() == false) {
            TicketSystem ticketSystem = new TicketSystem();
            ZooSystem zooSystem = new ZooSystem();
            while (!ticketSystem.purchaseAndValidateTicket())
                ;
            while (zooSystem.enterZoo())
                ;
        }
    }
}