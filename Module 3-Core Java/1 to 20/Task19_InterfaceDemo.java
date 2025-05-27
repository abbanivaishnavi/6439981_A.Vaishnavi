// Define the interface
interface Playable {
    void play();
}

// Guitar class implements Playable
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar 🎸");
    }
}

// Piano class implements Playable
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano 🎹");
    }
}

public class que19_InterfaceDemo {
    public static void main(String[] args) {
        // Instantiate Guitar and Piano
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        // Call play method
        guitar.play();
        piano.play();
    }
}
