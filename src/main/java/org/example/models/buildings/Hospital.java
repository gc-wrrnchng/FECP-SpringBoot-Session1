package org.example.models.buildings;

import org.example.models.animals.*;
import java.util.*;

public class Hospital extends Buildings {
    private List<Animal> patients = new ArrayList<>();

    public Hospital() {
        super("Hospital");
    }

    public void admitAnimal(Animal animal) {
        patients.add(animal);
        animal.setHealthy(false);
        System.out.println(animal.getClass().getName() + " has been admitted to the hospital.");
    }

    public Animal dischargeAnimal(Animal animal) {
        if(patients.remove(animal)) {
            animal.setHealthy(true);
            return animal;
        }
        return null;
    }

    public List<Animal> getPatients() {
        return patients;
    }

    @Override
    public void enter() {
        System.out.println("You entered the Hospital. Animals are being treated here.");
    }
}
