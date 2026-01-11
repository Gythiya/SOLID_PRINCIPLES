package withoutSOLID;

interface Worker {
    void work();

    void eat();
}

class Human implements Worker {

    public void work() {
        System.out.println("Human is working");
    }

    public void eat() {
        System.out.println("Human is eating");
    }
}

class Robot implements Worker {

    public void work() {
        System.out.println("Robot is working");
    }

    // Robot is forced to implement eat()
    public void eat() {
        throw new UnsupportedOperationException("Robot cannot eat");
    }
}

public class violate_ISP {
    public static void main(String[] args) {
        Worker human = new Human();
        human.work();
        human.eat();

        Worker robot = new Robot();
        robot.work();
        robot.eat(); // Runtime exception
    }
}
