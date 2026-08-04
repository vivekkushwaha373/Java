package solid_principles.dependency_inversion;

/**
 * BAD EXAMPLE: Violates Dependency Inversion Principle (DIP).
 * 
 * BadComputer (high-level module) depends DIRECTLY on StandardKeyboard 
 * (low-level module). They are tightly coupled.
 */
public class BadComputer {

    private StandardKeyboard keyboard;

    public BadComputer() {
        // Tightly coupled: We are forced to use a StandardKeyboard.
        this.keyboard = new StandardKeyboard(); 
    }

    public void writeCode() {
        keyboard.type();
        System.out.println("Code written with standard keyboard.");
    }
}
