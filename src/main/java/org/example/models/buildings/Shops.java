package org.example.models.buildings;

import java.util.*;

import org.example.models.ShopItem;

public abstract class Shops extends Buildings {
    public Shops(String name) {
        super(name);
    }

    public abstract List<ShopItem> getItems();
}
