package org.example.models.buildings;

import org.example.modules.ShopItem;

import java.util.List;

public class Foods extends Shops {
    public Foods() {
        super("Foods");
    }

    @Override
    public List<ShopItem> getItems() {
        return List.of(
                new ShopItem("Popcorn", 50),
                new ShopItem("Hotdog", 30),
                new ShopItem("Burger", 40)
        );
    }

    @Override
    public void enter() {
        System.out.println("You entered the Food Store.");
    }
}
