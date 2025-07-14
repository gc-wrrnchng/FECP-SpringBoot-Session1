package org.example.models.buildings;

import org.example.models.animals.Animal;
import org.example.models.animals.Pachyderm;

import java.util.*;

public class PachydermEnclosure extends Enclosures<Pachyderm> {
    public PachydermEnclosure(String name, List<Pachyderm> animals) {
        super(name, animals);
    }
}
