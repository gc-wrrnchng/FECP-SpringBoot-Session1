package org.example.admin;
import org.example.admin.models.modules.AdminMenu;
import org.example.admin.models.modules.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        AdminMenu AdminMenu = new AdminMenu(zoo);
        AdminMenu.start();
    }
}