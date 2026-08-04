package lld_design_patterns.structural.adapter;

/**
 * BAD EXAMPLE: The client trying to use incompatible objects.
 */
public class BadClient {
    
    public void fitPegs() {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        
        System.out.println("Fits? " + hole.fits(roundPeg)); // true
        
        SquarePeg smallSquarePeg = new SquarePeg(5);
        // The following line won't even compile!
        // System.out.println("Fits? " + hole.fits(smallSquarePeg));
        
        // We need an adapter to make smallSquarePeg compatible with RoundHole.
    }
}
