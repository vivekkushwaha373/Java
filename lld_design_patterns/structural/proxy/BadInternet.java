package lld_design_patterns.structural.proxy;

/**
 * BAD EXAMPLE: No control over the underlying object.
 * 
 * If we use this directly in a school or office, users can connect 
 * to any banned website without restriction.
 */
public class BadInternet {
    
    public void connectTo(String host) {
        System.out.println("Connecting to " + host);
    }
}
