package org.example.models.people;

public class Vendor extends Person {

    public Vendor(String name) {
        super("Unnamed vendor", "Shop");
    }

    public Vendor(String name, String location) {
        super(name, location);
    }

    public void sell(String item) {
        System.out.println(getName() + " is selling " + item + ".");
    }

    public String toString() {
        return "Vendor - " + super.toString();
    }
}
