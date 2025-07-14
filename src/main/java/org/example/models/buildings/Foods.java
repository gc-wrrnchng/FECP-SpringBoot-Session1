package org.example.models.buildings;

import java.util.List;

import org.example.models.ShopItem;

public class Foods extends Shops {
    public Foods() {
        super("Foods");
    }

    @Override
    public List<ShopItem> getItems() {
        return List.of(
                new ShopItem("Popcorn", 50),
                new ShopItem("Hotdog", 30),
                new ShopItem("Burger", 40));
    }
}
