package org.example;

import org.example.models.animals.*;
import org.example.modules.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create test animals
        List<Animal> animals = new ArrayList<>();
        Animal elephant = new Elephant("Pachyderm Enclosure");
        Animal lion = new Lion("Feline Enclosure");
        Animal owl = new Owl("Bird Enclosure");
        Animal tiger = new Tiger("Feline Enclosure");
        Animal parrot = new Parrot("Bird Enclosure");

        tiger.setHealthy(false);
        parrot.setHealthy(false);

        animals.add(elephant);
        animals.add(lion);
        animals.add(owl);
        animals.add(tiger);
        animals.add(parrot);

        Zoo zooVisitor = new Zoo(animals);

        int option;
        do {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Visit Enclosure");
            System.out.println("2. Visit Shop");
            System.out.println("3. Visit Hospital");
            System.out.println("4. Leave Zoo");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
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
                    break;
                }
                default: {
                    System.out.println("Not a valid option. Try again.");
                }
            }

        } while (option != 4);
    }

}
