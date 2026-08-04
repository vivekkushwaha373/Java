package lld_design_patterns.creational.prototype;

/**
 * BAD EXAMPLE: Client code trying to manually copy an object.
 */
public class BadShape {
    
    private int x;
    private int y;
    private String color;
    
    // ... constructors / getters / setters

    public void clientCode() {
        BadShape original = new BadShape();
        // Set up original...
        
        // Attempting to copy manually
        BadShape copy = new BadShape();
        // copy.x = original.x; // ERROR: x might be private!
        // We are forcing the client code to know all internal details of the object,
        // and if fields are private, it's impossible to copy them from the outside.
    }
}
