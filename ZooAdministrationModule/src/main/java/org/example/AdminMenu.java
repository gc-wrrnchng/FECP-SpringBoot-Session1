package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminMenu {
    private Zoo zoo;
    private Scanner scan;

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password";


    public AdminMenu(Zoo zoo){
        this.zoo = zoo;
        this.scan = new Scanner(System.in);

    }

    public void start(){
        System.out.println("----- Zoo Administrator Login -----");
        if(authenticate()){
            System.out.println("Login Successfully");
            zooAdminMainMenu();
        }else{
            System.out.println("Login Failed");
        }
    }

    private boolean authenticate(){
        System.out.println("Please login.");
        System.out.print("Enter Username: ");
        String username = scan.nextLine();
        System.out.print("Enter Password: ");
        String password = scan.nextLine();

        return username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD);
    }

    private void zooAdminMainMenu(){
        int choice = 0;

        while(true){
            System.out.println("----- Zoo Administrator Login -----");
            System.out.println("1. Setup Zoo Staff");
            System.out.println("2. Access Handler Module");
            System.out.println("3. Open Zoo to Visitors");
            System.out.println("4. Close Zoo to Visitors");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            try {
                choice = scan.nextInt();
                scan.nextLine();
                switch (choice) {
                    case 1:
                        setupZooStaff();
                        break;

                    case 2:
                        accessHandlerModule();
                        break;

                    case 3:
                        zoo.openZoo();
                        break;

                    case 4:
                        zoo.closeZoo();
                        break;

                    case 5:
                        System.out.println("Exiting Admin Menu");
                        break;

                    default:
                        System.out.println("Invalid Choice. Please try again.");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input type, Please enter valid number: ");
                scan.nextLine();
                choice = -1;
            }
        }



        }
    private void setupZooStaff(){
        System.out.println("----- Setup Zoo Staff -----");
        System.out.print("Enter your name, manager: ");
        zoo.setManager(scan.nextLine());

        System.out.print("Enter Veterinarian's name: ");
        zoo.setVeterinarian(scan.nextLine());

        System.out.print("Enter Handler for Pachyderm Enclosure: ");
        zoo.setPachydermHandler(scan.nextLine());

        System.out.print("Enter Handler for Feline Enclosure: ");
        zoo.setFelineHandler(scan.nextLine());

        System.out.print("Enter Handler for Bird Enclosure: ");
        zoo.setBirdHandler(scan.nextLine());

        System.out.print("Enter Vendor for Ticket shop: ");
        zoo.setTicketVendor(scan.nextLine());

        System.out.print("Enter Vendor for Shop: ");
        zoo.setShopVendor(scan.nextLine());

        System.out.println("Zoo staff setup complete");



    }

    private void accessHandlerModule(){
        System.out.println("Enter your name (handler): ");
        String handlerName = scan.nextLine();

        Handler currentHandler = null;

        if (zoo.getPachydermHandler() != null && zoo.getPachydermHandler().getName().equalsIgnoreCase(handlerName)){
            currentHandler = zoo.getPachydermHandler();

        } else if (zoo.getFelineHandler() != null && zoo.getFelineHandler().getName().equalsIgnoreCase(handlerName)){
            currentHandler = zoo.getFelineHandler();
        }else if (zoo.getBirdHandler() != null && zoo.getBirdHandler().getName().equalsIgnoreCase(handlerName)){
            currentHandler = zoo.getBirdHandler();
        }

        if (currentHandler != null){
            currentHandler.performDuties();
        }else{
            System.out.println("Handler with name: " + handlerName + " not found or not assigned to an enclosure");
            System.out.println("Please setup first via 'Setup Zoo Staff' option.");
            }
    }

}
