package org.example.models.buildings;

import org.example.modules.ShopItem;
import java.util.*;

public class Drinks extends Shops {
    public Drinks() {
        super("Drinks");
    }

    @Override
    public List<ShopItem> getItems() {
        return List.of(
                new ShopItem("Coke", 30),
                new ShopItem("Sprite", 30),
                new ShopItem("Pepsi", 30)
        );
    }

    @Override
    public void enter() {
        System.out.println("You entered the Drink store.");
    }
}
