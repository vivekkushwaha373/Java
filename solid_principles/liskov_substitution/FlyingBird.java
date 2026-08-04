package solid_principles.liskov_substitution;

/**
 * GOOD EXAMPLE: Complies with LSP.
 * 
 * We create a more specific classification for birds that can actually fly.
 */
public abstract class FlyingBird extends Bird {

    public void fly() {
        System.out.println("This bird is flying in the sky...");
    }
}
