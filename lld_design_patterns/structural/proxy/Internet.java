package lld_design_patterns.structural.proxy;

/**
 * GOOD EXAMPLE: The Subject interface.
 * Both the Real Subject and the Proxy must implement this.
 */
public interface Internet {
    void connectTo(String host) throws Exception;
}
