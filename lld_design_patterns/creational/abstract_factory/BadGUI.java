package lld_design_patterns.creational.abstract_factory;

/**
 * BAD EXAMPLE: Creating UI components using conditional logic everywhere.
 * 
 * If you forget to check the OS type somewhere, you might accidentally render
 * a Mac Button next to a Windows Checkbox! It violates OCP and is hard to maintain.
 */
public class BadGUI {

    public void renderUI(String osType) {
        // Creating a button
        if ("WINDOWS".equalsIgnoreCase(osType)) {
            System.out.println("Rendering a Windows Button");
        } else {
            System.out.println("Rendering a Mac Button");
        }

        // Creating a checkbox... we have to repeat the logic!
        if ("WINDOWS".equalsIgnoreCase(osType)) {
            System.out.println("Rendering a Windows Checkbox");
        } else {
            System.out.println("Rendering a Mac Checkbox");
        }
    }
}
