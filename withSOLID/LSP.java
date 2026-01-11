package withSOLID;

// Abstract base class with common and variable behavior
abstract class Bird {

    // Each bird has its own sound
    abstract void makeSound();

    // Common behavior for all birds
    void layEggs() {
        System.out.println("Bird lays eggs");
    }
}

// Interface for optional flying behavior
interface Flyable {
    void fly();
}

// Birds that can fly
class Crow extends Bird implements Flyable {

    @Override
    void makeSound() {
        System.out.println("Crow caws");
    }

    @Override
    public void fly() {
        System.out.println("Crow flies");
    }
}

class Parrot extends Bird implements Flyable {

    @Override
    void makeSound() {
        System.out.println("Parrot chirps");
    }

    @Override
    public void fly() {
        System.out.println("Parrot flies");
    }
}

// Bird that cannot fly
class Ostrich extends Bird {

    @Override
    void makeSound() {
        System.out.println("Ostrich makes a deep sound");
    }
}

// Main class
public class LSP {

    public static void main(String[] args) {

        Bird crow = new Crow();
        crow.makeSound();
        crow.layEggs();

        Flyable parrot = new Parrot();
        parrot.fly();

        Bird ostrich = new Ostrich();
        ostrich.makeSound();
        ostrich.layEggs();
    }
}
