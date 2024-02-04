import org.example.door.BarkRecognizer;
import org.example.door.DogDoor;
import org.example.door.Remote;

public class TestRec2 {
    public static void main(String[] args) throws InterruptedException {
        DogDoor door = new DogDoor();
        BarkRecognizer barkRecognizer = new BarkRecognizer(door);
        System.out.println("Fido barks to go outside...");
        barkRecognizer.recognize("Woof");

        Thread.sleep(5000);
        System.out.println("...but he's stuck outside!");
        System.out.println("\nFido starts barking...");
//        System.out.println("...so Gina grabs the remote control.");
        barkRecognizer.recognize("Woof");
        System.out.println("\nFido’s back inside...");
    }
}
