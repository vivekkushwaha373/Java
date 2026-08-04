package lld_design_patterns.structural.adapter;

/**
 * GOOD EXAMPLE: The Target object that the RoundHole works with.
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
