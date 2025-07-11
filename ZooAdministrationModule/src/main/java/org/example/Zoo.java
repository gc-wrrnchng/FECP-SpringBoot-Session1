package org.example;

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
    private Hospital hospital;

    public Zoo(){
        this.isOpen = false;
        this.hospital = new Hospital();

        this.animals = new ArrayList<>();
        animals.add(new Pachyderm("Dumbo", "Pachyderm Enclosure"));
        animals.add(new Feline("Mufasa", "Feline Enclosure"));
        animals.add(new Bird("Tweetie Bird", "Bird Enclosure"));
    }

    public boolean isOpen(){
        return isOpen;

    }

    public void openZoo(){
        if(!isOpen){
            isOpen = true;
            System.out.println("Zoo is now open to visitors! ");
        }else{
            System.out.println("Zoo is already open ");
        }
    }

    public void closeZoo(){
        if(isOpen){
            isOpen = false;
            System.out.println("Zoo is now closed to visitors! ");
        }else{
            System.out.println("Zoo is already closed");
        }
    }

    public void setManager(String name){
        this.manager = new Manager(name);
    }

    public void setVeterinarian(String name){
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
}
