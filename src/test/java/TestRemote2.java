import org.example.door.DogDoor;
import org.example.door.Remote;

public class TestRemote2 {
    public static void main(String[] args) throws InterruptedException {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        remote.pressBtn();

        Thread.sleep(5000);
        System.out.println("...but he's stuck outside!");
        System.out.println("\nFido starts barking...");
        System.out.println("...so Gina grabs the remote control.");
        remote.pressBtn();
        System.out.println("\nFido’s back inside...");
    }
}
