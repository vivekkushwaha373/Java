package solid_principles.dependency_inversion;

/**
 * GOOD EXAMPLE: Complies with DIP.
 * 
 * The Computer (high-level module) depends only on the Keyboard abstraction.
 * It has no idea what specific type of keyboard it is using.
 */
public class Computer {

    private Keyboard keyboard;

    // Dependency Injection via constructor
    // The dependency is inverted!
    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void writeCode() {
        keyboard.type();
        System.out.println("Code written successfully.");
    }
}
