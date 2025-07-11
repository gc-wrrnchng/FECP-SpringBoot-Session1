package org.example.models.buildings;

public class Hospital extends Buildings {
    public Hospital() {
        super("Hospital");
    }

    @Override
    public void enter() {
        System.out.println("You entered the Hospital. Animals are being treated here.");
    }
}
