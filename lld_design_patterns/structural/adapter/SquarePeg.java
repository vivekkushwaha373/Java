package lld_design_patterns.structural.adapter;

/**
 * GOOD EXAMPLE: The Adaptee.
 * This class has an incompatible interface (it provides getWidth() instead of getRadius()).
 * We cannot change this class (e.g., it belongs to a 3rd party library).
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
