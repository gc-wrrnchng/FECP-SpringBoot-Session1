package org.example.models.people;

public class Manager extends Person {

    public Manager(String name) {
        super("Unnamed Manager", "Main Office");
    }

    public Manager(String name, String location) {
        super(name, "Main Office");
    }

    public void CloseZoo() {
        System.out.println(getName() + " is closing the zoo.");
    }

    public void OpenZoo() {
        System.out.println(getName() + " is opening the zoo.");
    }

    public String toString() {
        return "Manager - " + super.toString();
    }

}
