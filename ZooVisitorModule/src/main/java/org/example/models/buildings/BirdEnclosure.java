package org.example.models.buildings;

import org.example.models.animals.Animal;
import java.util.*;

public class BirdEnclosure extends Enclosures {
    public BirdEnclosure(List<Animal> animals) {
        super("Bird Enclosure", animals);
    }
}
