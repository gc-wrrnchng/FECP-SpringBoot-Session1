package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Handler extends Person {

  private List<Animal> assignedAnimals;
  private Hospital hospital;


    public Handler() {
        super("Unnamed Handler", "General Enclosure");
        this.assignedAnimals = new ArrayList<>();
        this.hospital = null;
    }

    public Handler(String name, String enclosureType, Hospital hospital){
        super(name, enclosureType + " Enclosure");
        this.assignedAnimals = new ArrayList<>();
        this.hospital = hospital;
    }

    public void assignAnimal(Animal animal){
        if(animal != null && !assignedAnimals.contains(animal)){
            this.assignedAnimals.add(animal);
        }
    }

    public void feed(Animal animal){
        System.out.print(getName() + " is feeding " + animal.getName());
        animal.eat();
    }

    public void exercise(Animal animal){
        System.out.print(getName() + " is exercising " + animal.getName());
        animal.roam();
    }

    public void examine(Animal animal){
        System.out.println(getName() + " is examining " + animal.getName());

        System.out.println(" Do you want to send" + animal.getName() + " to the vet? (yes/no) " );
        Scanner scan = new Scanner(System.in);

        String choice = scan.next();
        if(choice.equals("yes") || choice.equals("y")){
            if(hospital!= null){
                hospital.admitAnimal(animal);
            } else {
                System.out.println("Hospital not Available");
            }
        }else{
            System.out.println(animal.getName() + " won't be going to the Hospital");
        }
    }

    public void performDuties(){
        if(assignedAnimals.isEmpty()){
            System.out.println(getName() + " has no animals assigned for duties today.");
            System.out.println("Finished duties for today.");
            return;
        }

        Scanner scan = new Scanner (System.in);
        int animalChoice;

        System.out.println("Welcome " + getName() + "!");

        do{
            System.out.println("Animals Assigned to you: ");
            for (int i = 0; i < assignedAnimals.size(); i++){
                System.out.println((i + 1) + ". " + assignedAnimals.get(i).getName());
            }

            System.out.println("Choose animal number to interact with (0 to exit): ");

            try{
                animalChoice = scan.nextInt();
                scan.nextLine();

                if(animalChoice > 0 && animalChoice <= assignedAnimals.size()){
                    Animal selectedAnimal = assignedAnimals.get(animalChoice - 1);
                    System.out.println("----- Interacting with " + selectedAnimal.getName() + "-----");
                    System.out.print("1. Feed");
                    System.out.print("2. Exercise");
                    System.out.print("3. Examine");
                    System.out.print("Choose Action: ");

                    int choice = scan.nextInt();
                    scan.nextLine();

                    switch(choice){
                        case 1:
                            feed(selectedAnimal);
                            break;

                        case 2:
                            exercise(selectedAnimal);
                            break;

                        case 3:
                            examine(selectedAnimal);
                            break;

                        default:
                            System.out.println("Invalid choice!");
                    }

                    }else if (animalChoice != 0){
                    System.out.println("Invalid Animal Selection");
                }
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number again.");
                scan.nextLine();
                animalChoice = -1;
            }
        }while (animalChoice != 0);
    }
}
