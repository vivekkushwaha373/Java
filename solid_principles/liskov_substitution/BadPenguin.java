package solid_principles.liskov_substitution;

/**
 * BAD EXAMPLE: Violates Liskov Substitution Principle (LSP).
 * 
 * Penguin is-a BadBird, so it inherits fly(). 
 * But a penguin cannot fly. If client code expects a BadBird and calls fly(), 
 * it will get an unexpected RuntimeException.
 * 
 * The subclass breaks the contract of the superclass.
 */
public class BadPenguin extends BadBird {

    @Override
    public void fly() {
        // Violating LSP! We are breaking the expected behavior.
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}
