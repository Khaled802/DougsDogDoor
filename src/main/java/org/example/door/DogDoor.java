package org.example.door;

public class DogDoor {
    private boolean opened;

    public DogDoor() {
        opened = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        opened = true;
    }

    public void close() {
        System.out.println("The dog door closes.");
        opened = false;
    }

    public boolean isOpen() {
        return opened;
    }
}
