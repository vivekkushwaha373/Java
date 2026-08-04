package solid_principles.liskov_substitution;

/**
 * GOOD EXAMPLE: Complies with LSP.
 * 
 * Sparrow can fly, so it extends FlyingBird.
 * Anywhere a FlyingBird or a Bird is expected, a Sparrow can be used safely.
 */
public class Sparrow extends FlyingBird {
    
    // Inherits eat() from Bird
    // Inherits fly() from FlyingBird
    
    @Override
    public void eat() {
        System.out.println("Sparrow is eating seeds...");
    }
    
    @Override
    public void fly() {
        System.out.println("Sparrow is fluttering around quickly...");
    }
}
