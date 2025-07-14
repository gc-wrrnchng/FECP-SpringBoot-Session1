package org.example.modules;

import org.example.models.animals.*;
import org.example.models.buildings.Drinks;
import org.example.models.buildings.Foods;
import org.example.models.buildings.Gifts;
import org.example.models.buildings.Shops;

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

    public void visitEnclosures() {
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


    public void visitShops() {
        List<Shops> shopTypes = List.of(
                new Foods(),
                new Drinks(),
                new Gifts()
        );

        System.out.println("\n=== Zoo Shops ===");
        for (int i = 0; i < shopTypes.size(); i++) {
            System.out.println((i + 1) + ". " + shopTypes.get(i).getName());
        }

        System.out.print("Choose a shop to visit: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice < 1 || choice > shopTypes.size()) {
            System.out.println("Invalid shop choice.");
            return;
        }

        Shops selectedShop = shopTypes.get(choice - 1);
        selectedShop.enter();
        List<ShopItem> items = selectedShop.getItems();
        List<ShopItem> cart = new ArrayList<>();

        boolean shopping = true;
        while (shopping) {
            System.out.println("\n=== " + selectedShop.getName() + " ===");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }

            System.out.print("\nEnter the number of the item you want to buy: ");
            int itemChoice = scanner.nextInt();
            scanner.nextLine();

            if (itemChoice >= 1 && itemChoice <= items.size()) {
                ShopItem selectedItem = items.get(itemChoice - 1);
                cart.add(selectedItem);
            } else {
                System.out.println("Invalid item.");
                continue;
            }

            System.out.println("\nSelected:");
            for (ShopItem item : cart) {
                System.out.println(item.getName() + " (" + item.getPrice() + " PHP)");
            }

            String confirm;

            do {
                System.out.print("\nProceed to checkout? (yes/no): ");
                confirm = scanner.nextLine();

                if (confirm.equalsIgnoreCase("yes")) {
                    int total = 0;
                    System.out.println("\nPayment successful!");
                    System.out.println("Receipt:");
                    for (ShopItem item : cart) {
                        System.out.println(" - " + item.getName() + ": " + item.getPrice() + " PHP");
                        total += item.getPrice();
                    }
                    System.out.println("Total Paid: " + total + " PHP");
                    shopping = false;
                    break;
                } else if (confirm.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Invalid option. Try again.");
                }
            } while(confirm != "yes");
        }
    }

    public void visitHospital() {
        Map<String, String> healedTimestamps = new LinkedHashMap<>();
        int option;

        do {
            System.out.println("\n=== Zoo Hospital Monitor ===");
            System.out.println("1. View Sick Animals");
            System.out.println("2. View Healed Animals");
            System.out.println("3. Attend Science Lecture");
            System.out.println("4. Heal Animals (Veterinarian)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("Sick Animals currently in Hospital:");
                    if (sickAnimals.isEmpty()) {
                        System.out.println("- None");
                    } else {
                        for (Animal animal : sickAnimals) {
                            System.out.println("- " + animal.getName());
                        }
                    }
                    break;
                }
                case 2 -> {
                    System.out.println("Healed Animals with Timestamps:");
                    if (healedTimestamps.isEmpty()) {
                        System.out.println("- None");
                    } else {
                        for (Map.Entry<String, String> entry : healedTimestamps.entrySet()) {
                            System.out.println("- " + entry.getKey() + " (" + entry.getValue() + ")");
                        }
                    }
                    break;
                }
                case 3 -> {
                    System.out.println("Dr. Ellie is giving a lecture on animal health and conservation.");
                    break;
                }
                case 4 -> {
                    if (sickAnimals.isEmpty()) {
                        System.out.println("No animals to heal.");
                        break;
                    }
                    System.out.println("Dr. Ellie begins healing sick animals...");
                    List<Animal> healedNow = new ArrayList<>();
                    for (Animal animal : sickAnimals) {
                        animal.setHealthy(true);
                        healedNow.add(animal);
                        String timestamp = java.time.LocalDateTime.now()
                                .format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                        healedTimestamps.put(animal.getName(), timestamp);
                        System.out.println("Healed: " + animal.getName());
                        System.out.println(animal.getName() + " has been discharged and returned to enclosure.");
                    }
                    sickAnimals.removeAll(healedNow);
                    healthyAnimals.addAll(healedNow);
                    break;
                }
                case 5 -> {
                    System.out.println("Exiting Zoo Vet Hospital. Goodbye!");
                    break;
                }
                default -> System.out.println("Invalid option.");
            }
        } while (option != 5);
    }
}
