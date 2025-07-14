package org.example.modules;

import org.example.models.animals.*;
import org.example.modules.ZooVisitor.*;

import java.util.*;

public class ZooSystem {

    public boolean enterZoo() {
        Scanner scanner = new Scanner(System.in);

        // Setting up the zoo
        ZooVisitor zooVisitor = getZoo();
        //

        int option;
        do {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Visit Enclosure");
            System.out.println("2. Visit Shop");
            System.out.println("3. Visit Hospital");
            System.out.println("4. Leave Zoo");
            System.out.print("Choose an option: ");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // consume the invalid input
                option = -1; // set to invalid option to repeat loop
            }

            switch (option) {
                case 1: {
                    zooVisitor.visitEnclosures();
                    break;
                }
                case 2: {
                    zooVisitor.visitShops();
                    break;
                }
                case 3: {
                    zooVisitor.visitHospital();
                    break;
                }
                case 4: {
                    System.out.println("=== Thank you for visiting the Zoo! ===");
                    return false;
                }
                default: {
                    System.out.println("Not a valid option. Try again.");
                }
            }

        } while (option != 4);

        return false;
    }

    private static ZooVisitor getZoo() {
        List<Animal> animals = new ArrayList<>();
        Animal elephant = new Elephant("Dumbo", "Pachyderm Enclosure");
        Animal lion = new Lion("Leo", "Feline Enclosure");
        Animal owl = new Owl("Hoot", "Bird Enclosure");
        Animal tiger = new Tiger("Tigress", "Feline Enclosure");
        Animal parrot = new Parrot("Parakeet", "Bird Enclosure");

        tiger.setHealthy(false);
        parrot.setHealthy(false);

        animals.add(elephant);
        animals.add(lion);
        animals.add(owl);
        animals.add(tiger);
        animals.add(parrot);

        ZooVisitor zooVisitor = new ZooVisitor(animals);
        return zooVisitor;
    }

    public static void main(String[] args) {
        ZooSystem zooSystem = new ZooSystem();
        zooSystem.enterZoo();
    }
}
