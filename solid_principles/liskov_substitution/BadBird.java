package solid_principles.liskov_substitution;

/**
 * BAD EXAMPLE: Base class that forces behavior on all subclasses.
 */
public class BadBird {
    
    public void eat() {
        System.out.println("Bird is eating...");
    }

    /**
     * By putting fly() in the base class, we assume EVERY bird can fly.
     * This assumption leads to LSP violations.
     */
    public void fly() {
        System.out.println("Bird is flying up in the sky...");
    }
}
