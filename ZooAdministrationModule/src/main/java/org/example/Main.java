package org.example;
import org.example.models.modules.AdminMenu;
import org.example.models.modules.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        AdminMenu AdminMenu = new AdminMenu(zoo);
        AdminMenu.start();
    }
}