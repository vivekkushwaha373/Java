package lld_design_patterns.structural.proxy;

/**
 * GOOD EXAMPLE: The Real Subject.
 * The object that actually does the real work.
 */
public class RealInternet implements Internet {

    @Override
    public void connectTo(String host) {
        System.out.println("Connecting to " + host);
        // Actual HTTP connection logic would go here
    }
}
