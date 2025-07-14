package org.example.models.buildings;

import org.example.admin.models.animals.Animal;
import java.util.*;

public class Hospital extends Buildings{
    private List<Animal> patients = new ArrayList<>();

    public Hospital() {
    }

    public void admitAnimal(Animal animal) {
        if (animal != null && !patients.contains(animal)) {
            patients.add(animal);
            animal.setHealthy(false);
            System.out.println(animal.getName() + " has been admitted to the hospital.");
        } else if (animal != null) {
            System.out.println(animal.getName() + " is already in the hospital.");
        }
    }

    public Animal dischargeAnimal(Animal animal) {
        if (patients.remove(animal)) {
            animal.setHealthy(true);
            return animal;
        }
        return null;
    }

    public List<Animal> getPatients() {
        return patients;
    }
}
