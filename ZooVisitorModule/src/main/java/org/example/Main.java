package org.example;

import org.example.models.animals.*;
import org.example.modules.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create test animals
        List<Animal> animals = new ArrayList<>();
        Animal elephant = new Elephant("Pachyderm Enclosure");
        Animal lion = new Lion("Feline Enclosure");
        Animal owl = new Owl("Bird Enclosure");
        Animal tiger = new Tiger("Feline Enclosure");
        Animal parrot = new Parrot("Bird Enclosure");

        animals.add(elephant);
        animals.add(lion);
        animals.add(owl);
        animals.add(tiger);
        animals.add(parrot);

        Zoo zoo = new Zoo(animals);
        zoo.startExperience();
    }
}
