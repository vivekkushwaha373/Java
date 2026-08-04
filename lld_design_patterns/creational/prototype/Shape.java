package lld_design_patterns.creational.prototype;

/**
 * GOOD EXAMPLE: The Prototype interface.
 * 
 * We define our own instead of using java.lang.Cloneable to avoid 
 * the flaws of the built-in Java cloning mechanism.
 */
public abstract class Shape {
    
    public int x;
    public int y;
    public String color;

    // Default constructor
    public Shape() {}

    // Copy constructor (the secret sauce to safe copying)
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    // The abstract clone method
    public abstract Shape clone();
}
