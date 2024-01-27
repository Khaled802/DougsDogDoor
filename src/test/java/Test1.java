import org.example.door.DogDoor;
import org.example.door.Remote;

public class Test1 {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside...");
        remote.pressBtn();
        System.out.println("\nFido has gone outside...");
        remote.pressBtn();
        System.out.println("\nFido’s all done...");
        remote.pressBtn();
        System.out.println("\nFido’s back inside...");
        remote.pressBtn();
    }
}
