package lld_design_patterns.creational.prototype;

/**
 * GOOD EXAMPLE: Concrete prototype.
 */
public class Circle extends Shape {
    
    public int radius;

    public Circle() {}

    // Copy constructor calls the super copy constructor
    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        // Delegates to the copy constructor
        return new Circle(this);
    }
}
