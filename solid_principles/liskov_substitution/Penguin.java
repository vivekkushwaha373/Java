package solid_principles.liskov_substitution;

/**
 * GOOD EXAMPLE: Complies with LSP.
 * 
 * Penguin extends Bird directly. It does NOT extend FlyingBird.
 * We can pass a Penguin anywhere a Bird is expected (for eating).
 * We CANNOT pass a Penguin where a FlyingBird is expected (compiler error), 
 * avoiding runtime crashes!
 */
public class Penguin extends Bird {
    
    // Inherits eat() from Bird
    
    public void swim() {
        System.out.println("Penguin is swimming in the ocean...");
    }
}
