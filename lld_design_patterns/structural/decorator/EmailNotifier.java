package lld_design_patterns.structural.decorator;

/**
 * GOOD EXAMPLE: The Concrete Component.
 * The core behavior that we want to decorate.
 */
public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
