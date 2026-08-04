package solid_principles.dependency_inversion;

/**
 * BAD EXAMPLE: A concrete class (low-level module).
 */
public class StandardKeyboard {
    
    public void type() {
        System.out.println("Typing on a standard membrane keyboard...");
    }
}
