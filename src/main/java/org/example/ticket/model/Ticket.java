package org.example.ticket.model;

public class Ticket {
    private String code;
    private String type;
    private double price;

    public Ticket(String code, String type, double price) {
        this.code = code;
        this.type = type;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
