package org.example.models.buildings;

import org.example.modules.ShopItem;

import java.util.List;

public class Gifts extends Shops {
    public Gifts() {
        super("Gifts");
    }

    @Override
    public List<ShopItem> getItems() {
        return List.of(
                new ShopItem("Keychain", 45),
                new ShopItem("Plush Toy", 120),
                new ShopItem("Headband", 40)
        );
    }

    @Override
    public void enter() {
        System.out.println("You entered the Gift Store.");
    }
}
