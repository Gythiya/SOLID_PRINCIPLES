package withoutSOLID;

class Bird {

    void makeSound() {
        System.out.println("Bird makes sound");
    }

    void layEggs() {
        System.out.println("Bird lays eggs");
    }

    void fly() {
        System.out.println("Bird flies");
    }
}

class Crow extends Bird {
    // Crow can fly → OK
}

class Ostrich extends Bird {

    // Ostrich cannot fly
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly");
    }
}

public class violate_LSP {
    public static void main(String[] args) {

        Bird bird1 = new Crow();
        bird1.fly(); // Works

        Bird bird2 = new Ostrich();
        bird2.fly(); // Runtime error
    }
}
