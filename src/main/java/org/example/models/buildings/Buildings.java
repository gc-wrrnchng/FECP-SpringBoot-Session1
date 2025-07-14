package org.example.models.buildings;

public abstract class Buildings {
    protected String name;

    public Buildings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
