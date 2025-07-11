package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Animal> admittedAnimals;

    public Hospital(){
        this.admittedAnimals = new ArrayList<>();
    }

    public void admitAnimal(Animal animal){
        if(!admittedAnimals.contains(animal)){
            animal.setHealthy(false);
            admittedAnimals.add(animal);
            String admissionTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss"));
            System.out.println("Sending to hospital...");
            System.out.println(animal.getName() + " is admitted at " + admissionTime);
        } else{
            System.out.println(animal.getName() + " is already admitted to the Hospital");
        }
    }
}
