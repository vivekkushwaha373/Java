package lld_design_patterns.structural.adapter;

/**
 * GOOD EXAMPLE: The Target class.
 * This is the interface our client code expects to work with.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return (this.getRadius() >= peg.getRadius());
    }
}
