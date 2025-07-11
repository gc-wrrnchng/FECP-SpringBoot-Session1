package org.example.models.buildings;

public abstract class Shops extends Buildings {
    public Shops(String name) {
        super(name);
    }

    @Override
    public abstract void enter();
}
