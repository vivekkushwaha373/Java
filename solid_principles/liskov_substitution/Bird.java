package solid_principles.liskov_substitution;

/**
 * GOOD EXAMPLE: Complies with LSP.
 * 
 * We keep only the traits that are TRULY common to ALL birds.
 */
public abstract class Bird {

    public void eat() {
        System.out.println("This bird is eating...");
    }
    
    // Notice: NO fly() method here!
}
