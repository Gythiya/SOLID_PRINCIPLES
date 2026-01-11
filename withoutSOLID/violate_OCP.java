package withoutSOLID;

class GameCharacter {

    void performAction(String characterType) {

        if (characterType.equals("Warrior")) {
            System.out.println("Warrior attacks with sword");
        } else if (characterType.equals("Archer")) {
            System.out.println("Archer attacks with bow");
        } else if (characterType.equals("Mage")) {
            System.out.println("Mage casts a spell");
        }
        // If a new character is added,
        // this method must be modified again
    }
}

public class violate_OCP {
    public static void main(String[] args) {
        GameCharacter game = new GameCharacter();

        game.performAction("Warrior");
        game.performAction("Archer");
        game.performAction("Mage");
    }
}