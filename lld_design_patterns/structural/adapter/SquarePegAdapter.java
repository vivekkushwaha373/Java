package lld_design_patterns.structural.adapter;

/**
 * GOOD EXAMPLE: The Adapter.
 * It EXTENDS the Target interface (RoundPeg) so the client can use it,
 * and it WRAPS the Adaptee (SquarePeg) to translate the data.
 */
public class SquarePegAdapter extends RoundPeg {
    
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    /**
     * This is where the translation happens.
     * We calculate the minimum circle radius that can fit this square peg.
     */
    @Override
    public double getRadius() {
        // The formula to fit a square peg in a round hole: r = (width * sqrt(2)) / 2
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
