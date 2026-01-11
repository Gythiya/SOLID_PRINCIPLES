package withoutSOLID;

class WiredKeyboard {
    void connect() {
        System.out.println("Wired keyboard connected");
    }
}

class Computer {

    // Tight coupling to WiredKeyboard
    private WiredKeyboard keyboard = new WiredKeyboard();

    void start() {
        keyboard.connect();
    }
}

public class violate_DIP {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.start();
    }
}
