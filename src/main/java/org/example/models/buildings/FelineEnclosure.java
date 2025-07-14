package org.example.models.buildings;

import org.example.models.animals.Animal;
import org.example.models.animals.Feline;

import java.util.*;

public class FelineEnclosure extends Enclosures<Feline> {
    public FelineEnclosure(String name, List<Feline> animals) {
        super(name, animals);
    }
}
