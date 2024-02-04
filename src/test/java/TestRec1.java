import org.example.door.BarkRecognizer;
import org.example.door.DogDoor;
import org.example.door.Remote;

public class TestRec1 {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer barkRecognizer = new BarkRecognizer(door);
        System.out.println("Fido barks to go outside...");
        barkRecognizer.recognize("Woof");
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido’s all done...");
        System.out.println("\nFido’s back inside...");
    }
}
