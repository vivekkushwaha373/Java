package solid_principles.dependency_inversion;

/**
 * GOOD EXAMPLE: Complies with DIP.
 * 
 * A new low-level module that depends on the Keyboard abstraction.
 * We can easily swap this in for a Computer without modifying the Computer class!
 */
public class MechanicalKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Click clack! Typing on a loud mechanical keyboard...");
    }
}
