package org.example;

import java.util.Scanner;

import org.example.model.Ticket;
import org.example.model.Visitor;
import org.example.model.ticketprice.TicketFactory;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 🎟️ WELCOME TO THE ZOO TICKET SHOP ===");
        System.out.println();
        System.out.println("Here's what you can experience in the zoo:");
        System.out.println("1. 🐘 Visit Animal Enclosures (Elephant, Lion, Owl)");
        System.out.println("2. 🍟 Buy snacks and drinks from our Shops");
        System.out.println("3. 👩‍🏫 Listen to science lectures at the Hospital");
        System.out.println("4. 🎁 Buy fun gifts at our Gift Shop");
        
        System.out.println();
        System.out.print("Would you like to buy a ticket? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();
        if (!response.equals("yes") && !response.equals("y")) {
            System.out.println("Thank you for visiting! Have a great day!");
            scanner.close();
            return;
        }
        System.out.println();
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age;
        while (true) {
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age < 0) {
                    System.out.println("Age cannot be negative. Please enter a valid age.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid age.");
            }
        }

        Visitor visitor = new Visitor(name, age);
        Ticket ticket = TicketFactory.createTicket(visitor);

        System.out.println("\nYou qualify for a/an " + ticket.getType().toUpperCase() + " ticket.");
        System.out.println("Ticket Price: ₱" + ticket.getPrice());
        
        System.out.println("\nTicket Details:");
        System.out.println("Visitor Name: " + visitor.getName());
        System.out.println("Visitor Age: " + visitor.getAge());
        System.out.println("Ticket Type: " + ticket.getType());
        System.out.println("Ticket Price: ₱" + ticket.getPrice());
        
        System.out.print("\nProceed with purchase? (yes/no): ");
        String confirmation = scanner.nextLine().trim().toLowerCase();
        if (confirmation.equals("yes") || confirmation.equals("y")) {
            System.out.println("\nTicket purchased!");
            System.out.println("Your ticket code is: " + ticket.getCode());
            System.out.println("Please keep this code for entry.");
            System.out.println();
            System.out.println("[Ticket added to system]");
        } else {
            System.out.println("\nYour purchase has been cancelled.");
            scanner.close();
            return;
        }

        System.out.println("=== 🎟️ VISITOR ENTRY ===");
        System.out.print("Enter your ticket code: ");
        System.out.println(ticket.getCode());
        // TODO: Implement ticket validation
        scanner.close();
    }
}