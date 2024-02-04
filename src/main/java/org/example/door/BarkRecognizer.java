package org.example.door;

import java.util.Timer;
import java.util.TimerTask;

public class BarkRecognizer {
    private final DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(String bark) {
        System.out.println("Recognize: " + bark);
        dogDoor.open();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                dogDoor.close();
                timer.cancel();
            }
        }, 3000);
    }
}
