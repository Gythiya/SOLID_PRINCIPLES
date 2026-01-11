package withSOLID;

interface GameCharacter {
    void performAction();
}

class Warrior implements GameCharacter {
    public void performAction() {
        System.out.println("Warrior attacks with sword");
    }
}

class Archer implements GameCharacter {
    public void performAction() {
        System.out.println("Archer attacks with bow");
    }
}

class Mage implements GameCharacter {
    public void performAction() {
        System.out.println("Mage casts a spell");
    }
}

public class OCP {
    public static void main(String[] args) {

        GameCharacter warrior = new Warrior();
        GameCharacter archer = new Archer();
        GameCharacter mage = new Mage();

        warrior.performAction();
        archer.performAction();
        mage.performAction();

        // In future, new characters can be added
        // by creating a new class that implements GameCharacter
        // without modifying this existing code
    }
}
