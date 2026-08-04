package lld_design_patterns.creational.abstract_factory;

// --- Concrete Factory 1 ---

/**
 * Creates the entire family of Windows UI components.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Inner classes for brevity (usually in separate files)
class WindowsButton implements Button {
    public void paint() { System.out.println("Painting Windows Button"); }
}

class WindowsCheckbox implements Checkbox {
    public void paint() { System.out.println("Painting Windows Checkbox"); }
}
