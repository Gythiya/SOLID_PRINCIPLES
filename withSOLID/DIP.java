package withSOLID;

// Abstraction
interface Keyboard {
    void connect();
}

// Low-level modules
class WiredKeyboard implements Keyboard {
    public void connect() {
        System.out.println("Wired keyboard connected");
    }
}

class WirelessKeyboard implements Keyboard {
    public void connect() {
        System.out.println("Wireless keyboard connected");
    }
}

// High-level module
class Computer {

    private Keyboard keyboard;

    // Dependency Injection via constructor
    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void start() {
        keyboard.connect();
    }
}

// Main class
public class DIP {
    public static void main(String[] args) {

        // Customer chooses wired keyboard
        Keyboard wired = new WiredKeyboard();
        Computer pc1 = new Computer(wired);
        pc1.start();

        // Later customer upgrades to wireless keyboard
        Keyboard wireless = new WirelessKeyboard();
        Computer pc2 = new Computer(wireless);
        pc2.start();
    }
}
