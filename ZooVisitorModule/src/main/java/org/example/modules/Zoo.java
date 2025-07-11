package org.example.modules;

import org.example.models.*;

import java.util.*;

public class Zoo {
    private List<Animal> healthyAnimals;
    private List<Animal> sickAnimals;
    private Scanner scanner;

    public Zoo(List<Animal> animals) {
        this.healthyAnimals = new ArrayList<>();
        this.sickAnimals = new ArrayList<>();
        this.scanner = new Scanner(System.in);

        for(Animal animal : animals) {
            if(animal.isHealthy()) {
                healthyAnimals.add(animal);
            } else {
                sickAnimals.add(animal);
            }
        }
    }

    private Map<String, List<Animal>> getGroupedEnclosures() {
        Map<String, List<Animal>> enclosures = new LinkedHashMap<>();
        enclosures.put("Pachyderm", new ArrayList<>());
        enclosures.put("Feline", new ArrayList<>());
        enclosures.put("Bird", new ArrayList<>());

        for (Animal a : healthyAnimals) {
            if (a instanceof Pachyderm) {
                enclosures.get("Pachyderm").add(a);
            } else if (a instanceof Feline) {
                enclosures.get("Feline").add(a);
            } else if (a instanceof Bird) {
                enclosures.get("Bird").add(a);
            }
        }
        return enclosures;
    }

    private void visitEnclosures() {
        Map<String, List<Animal>> grouped = getGroupedEnclosures();
        List<String> availableTypes = new ArrayList<>();

        System.out.println("\n===Zoo Enclosure===");
        int index = 1;
        for (Map.Entry<String, List<Animal>> entry : grouped.entrySet()) {
            String type = entry.getKey();
            List<Animal> animals = entry.getValue();

            if (!animals.isEmpty()) {
                availableTypes.add(type);
                String animalNames = animals.stream()
                        .map(Animal::getName)
                        .distinct()
                        .reduce((a, b) -> a + ", " + b)
                        .orElse("");
                System.out.println(index + ". " + type + " (" + animalNames + ")");
                index++;
            }
        }

        if (availableTypes.isEmpty()) {
            System.out.println("There are no healthy animals in any enclosures.");
            return;
        }

        System.out.println("Choose Enclosure:");
        int option = scanner.nextInt();
        scanner.nextLine();

        if(option < 1 || option > availableTypes.size()) {
            System.out.println("Invalid option.");
            return;
        }

        String selectedType = availableTypes.get(option - 1);
        List<Animal> animals = grouped.get(selectedType);

        if(animals.isEmpty()) {
            System.out.println("No animals currently in this enclosure.");
            return;
        }

        System.out.println("\n--- " + selectedType + " ---");
        for(int i = 0; i < animals.size(); i++) {
            System.out.println((i + 1) + ". " + animals.get(i).getName());
        }

        System.out.println("Choose an animal to feed: ");
        int animalOption = scanner.nextInt();
        scanner.nextLine();

        if(animalOption >= 1 && animalOption <= animals.size()) {
            Animal selected = animals.get(animalOption - 1);
            System.out.println("Would you like to feed " + selected.getName() + "? (yes/no): ");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("yes")) {
                selected.eat();
                selected.makeSound();
            } else {
                System.out.println("You observe the " + selected.getName() + " from a distance.");
            }
        } else {
            System.out.println("Invalid option.");
        }
    }

    private void visitShops() {

    }

    public void startExperience() {
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
                    visitEnclosures();
                    break;
                }
                case 2: {
                    visitShops();
                }
                case 3: {

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
