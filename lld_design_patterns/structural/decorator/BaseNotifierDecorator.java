package lld_design_patterns.structural.decorator;

/**
 * GOOD EXAMPLE: The Base Decorator.
 * 
 * It implements the same interface, but it also HAS a reference to the interface.
 * It delegates all operations to the wrapped object.
 */
public abstract class BaseNotifierDecorator implements Notifier {

    private Notifier wrappee;

    public BaseNotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        // Delegate to the wrapped object
        wrappee.send(message);
    }
}
