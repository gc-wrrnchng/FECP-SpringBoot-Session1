package org.example.models.buildings;

import java.util.List;

import org.example.models.ShopItem;

public class Gifts extends Shops {
    public Gifts() {
        super("Gifts");
    }

    @Override
    public List<ShopItem> getItems() {
        return List.of(
                new ShopItem("Keychain", 45),
                new ShopItem("Plush Toy", 120),
                new ShopItem("Headband", 40));
    }

    @Override
    public void enter() {
        System.out.println("You entered the Gift Store.");
    }
}
