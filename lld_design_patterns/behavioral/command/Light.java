package lld_design_patterns.behavioral.command;

/**
 * GOOD EXAMPLE: The Receiver.
 * The class that actually does the real work.
 */
public class Light {
    
    public void turnOn() {
        System.out.println("The light is ON.");
    }
    
    public void turnOff() {
        System.out.println("The light is OFF.");
    }
}
