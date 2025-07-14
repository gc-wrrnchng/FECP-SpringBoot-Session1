package org.example.models.buildings;

import java.util.*;

import org.example.models.ShopItem;

public class Drinks extends Shops {
    public Drinks() {
        super("Drinks");
    }

    @Override
    public List<ShopItem> getItems() {
        return List.of(
                new ShopItem("Coke", 30),
                new ShopItem("Sprite", 30),
                new ShopItem("Pepsi", 30));
    }
}
