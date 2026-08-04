package lld_design_patterns.behavioral.command;

/**
 * BAD EXAMPLE: Tight coupling between Invoker (UI) and Receiver (Light).
 * 
 * The button explicitly knows about the Light class and its methods.
 * If we want this button to turn on a TV instead, we have to rewrite this class.
 */
public class BadSmartHome {
    
    public void pressButton() {
        // Tightly coupled! The UI shouldn't need to know the specifics
        // of how a Light works.
        Light livingRoomLight = new Light();
        livingRoomLight.turnOn();
        System.out.println("Button pressed.");
    }
}
