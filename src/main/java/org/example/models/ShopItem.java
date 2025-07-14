package org.example.models;

public class ShopItem {
    private final String name;
    private final int price;

    public ShopItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " PHP";
    }
}

