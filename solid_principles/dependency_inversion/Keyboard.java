package solid_principles.dependency_inversion;

/**
 * GOOD EXAMPLE: An abstraction (interface).
 * 
 * Both high-level modules (Computer) and low-level modules (specific keyboards) 
 * will depend on this abstraction.
 */
public interface Keyboard {
    void type();
}
