package org.example.door;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {

    private final DogDoor dogDoor;

    public Remote(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void pressBtn() {
        if (dogDoor.isOpen())
            dogDoor.close();
        else {
            dogDoor.open();
            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    dogDoor.close();
                    timer.cancel();
                }
            }, 3000);
        }
    }
}
