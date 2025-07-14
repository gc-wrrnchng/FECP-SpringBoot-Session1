package org.example.admin.models.modules;

import org.example.admin.models.animals.Animal;
import org.example.admin.models.animals.Bird;
import org.example.admin.models.animals.Feline;
import org.example.admin.models.animals.Pachyderm;
import org.example.admin.models.buildings.*;
import org.example.admin.models.people.Handler;
import org.example.admin.models.people.Manager;
import org.example.admin.models.people.Vendor;
import org.example.admin.models.people.Veterinarian;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private boolean isOpen;

    private Manager manager;
    private Veterinarian veterinarian;
    private Handler pachydermHandler;
    private Handler felineHandler;
    private Handler birdHandler;
    private Vendor ticketVendor;
    private Vendor shopVendor;

    private List<Animal> animals;
    private List<Enclosure> enclosures;
    private PachydermEnclosure pachydermEnclosure;
    private FelineEnclosure felineEnclosure;
    private BirdEnclosure birdEnclosure;

    private Hospital hospital;

    public Zoo() {
        this.isOpen = false;
        this.hospital = new Hospital();
        this.enclosures = new ArrayList<>();

        this.animals = new ArrayList<>();

        this.felineEnclosure = new FelineEnclosure("Feline's Den");
        this.pachydermEnclosure = new PachydermEnclosure("Pachyderm's Habitat");
        this.birdEnclosure = new BirdEnclosure("Bird's Habitat");

        enclosures.add(felineEnclosure);
        enclosures.add(pachydermEnclosure);
        enclosures.add(birdEnclosure);

        Feline mufasa = new Feline("Mufasa", felineEnclosure);
        Feline meow = new Feline("Meow", felineEnclosure);
        Pachyderm dumbo = new Pachyderm("Dumbo", pachydermEnclosure);
        Pachyderm dumby = new Pachyderm("Dumby", pachydermEnclosure);
        Bird tweetie = new Bird("tweetie", birdEnclosure);

        animals.add(mufasa);
        animals.add(meow);
        animals.add(dumbo);
        animals.add(dumby);
        animals.add(tweetie);

        felineEnclosure.getAnimals().add(mufasa);
        felineEnclosure.getAnimals().add(meow);
        pachydermEnclosure.getAnimals().add(dumbo);
        pachydermEnclosure.getAnimals().add(dumby);
        birdEnclosure.getAnimals().add(tweetie);

    }

    public boolean isOpen() {
        return isOpen;

    }

    public void openZoo() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Zoo is now open to visitors! ");
        } else {
            System.out.println("Zoo is already open ");
        }
    }

    public void closeZoo() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Zoo is now closed to visitors! ");
        } else {
            System.out.println("Zoo is already closed");
        }
    }

    public void setManager(String name) {
        this.manager = new Manager(name);
    }

    public void setVeterinarian(String name) {
        this.veterinarian = new Veterinarian(name);
    }

    public void setPachydermHandler(String name) {
        this.pachydermHandler = new Handler(name, "Pachyderm", hospital);
        animals.stream()
                .filter(a -> a instanceof Pachyderm)
                .forEach(this.pachydermHandler::assignAnimal);
    }

    public void setFelineHandler(String name) {
        this.felineHandler = new Handler(name, "Feline", hospital);
        animals.stream()
                .filter(a -> a instanceof Feline)
                .forEach(this.felineHandler::assignAnimal);
    }

    public void setBirdHandler(String name) {
        this.birdHandler = new Handler(name, "Bird", hospital);
        animals.stream()
                .filter(a -> a instanceof Bird)
                .forEach(this.birdHandler::assignAnimal);
    }

    public void setTicketVendor(String name) {
        this.ticketVendor = new Vendor(name, "Ticket");
    }

    public void setShopVendor(String name) {
        this.shopVendor = new Vendor(name, "Shop");
    }

    public Handler getPachydermHandler() {
        return pachydermHandler;
    }

    public Handler getFelineHandler() {
        return felineHandler;
    }

    public Handler getBirdHandler() {
        return birdHandler;
    }

    public PachydermEnclosure getPachydermEnclosure() {
        return pachydermEnclosure;
    }

    public FelineEnclosure getFelineEnclosure() {
        return felineEnclosure;
    }

    public BirdEnclosure getBirdEnclosure() {
        return birdEnclosure;
    }

    public List<Enclosure> getEnclosures() {
        return enclosures;
    }
}
