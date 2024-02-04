import org.example.door.DogDoor;
import org.example.door.Remote;

public class TestRemote1 {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        remote.pressBtn();
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido’s all done...");
        System.out.println("\nFido’s back inside...");
    }
}
