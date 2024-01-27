package org.example.door;

public class Remote {

    private final DogDoor dogDoor;

    public Remote(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void pressBtn() {
        if (dogDoor.isOpen())
            dogDoor.close();
        else
            dogDoor.open();
    }
}
