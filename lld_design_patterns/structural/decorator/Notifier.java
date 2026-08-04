package lld_design_patterns.structural.decorator;

/**
 * GOOD EXAMPLE: The Component interface.
 * Both the core component and all decorators will implement this.
 */
public interface Notifier {
    void send(String message);
}
