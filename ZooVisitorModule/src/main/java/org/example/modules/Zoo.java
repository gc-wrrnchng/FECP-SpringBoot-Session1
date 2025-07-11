package org.example.modules;

import org.example.models.animals.*;

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
        Map<Integer, String> items = new LinkedHashMap<>();
        items.put(1, "Soft Drink - 30 PHP");
        items.put(2, "Popcorn - 50 PHP");
        items.put(3, "Plush Toy - 120 PHP");
        items.put(4, "Keychain - 45 PHP");

        Map<String, Integer> itemPrices = Map.of(
                "Soft Drink", 30,
                "Popcorn", 50,
                "Plush Toy", 120,
                "Keychain", 45
        );

        List<String> cart = new ArrayList<>();
        boolean shopping = true;

        while (shopping) {
            System.out.println("\n=== Zoo Shop ===");
                    items.forEach((key, value) -> System.out.println(key + ". " + value));

            System.out.print("Enter the number of the item you want to buy: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            String selectedItem = null;
            if (items.containsKey(choice)) {
                selectedItem = items.get(choice).split(" - ")[0];
                cart.add(selectedItem);
            } else {
                System.out.println("Invalid choice.");
                continue;
            }

            System.out.println("Selected:");
            for (String item : cart) {
                System.out.println(item + " (" + itemPrices.get(item) + " PHP)");
            }

            System.out.print("Proceed to checkout? (yes/no): ");
                    String proceed = scanner.nextLine();

            if (proceed.equalsIgnoreCase("yes")) {
                int total = 0;
                System.out.println("Payment successful!");
                System.out.println("Receipt:");
                for (String item : cart) {
                    int price = itemPrices.get(item);
                    System.out.println(" - " + item + ": " + price + " PHP");
                    total += price;
                }
                System.out.println("Total Paid: " + total + " PHP");
                shopping = false;
            } else if(proceed.equalsIgnoreCase("no")) {
                continue;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    public void visitHospital() {
        Map<String, String> healedTimestamps = new LinkedHashMap<>();
        int option;

        do {
            System.out.println("=== Zoo Hospital Monitor ===");
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
                        animal.healthy = true;
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
