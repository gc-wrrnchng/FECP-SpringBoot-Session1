package org.example.models.buildings;

import org.example.models.animals.Bird;

import java.util.*;

public class BirdEnclosure extends Enclosures<Bird> {
    public BirdEnclosure(String name, List<Bird> animals) {
        super(name, animals);
    }
}
