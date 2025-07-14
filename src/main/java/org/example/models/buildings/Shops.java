package org.example.models.buildings;

import org.example.modules.ShopItem;

import java.util.*;

public abstract class Shops extends Buildings {
    public Shops(String name) {
        super(name);
    }

    public abstract List<ShopItem> getItems();

    @Override
    public abstract void enter();
}
