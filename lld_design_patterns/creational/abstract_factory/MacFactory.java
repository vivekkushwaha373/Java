package lld_design_patterns.creational.abstract_factory;

// --- Concrete Factory 2 ---

/**
 * Creates the entire family of Mac UI components.
 */
public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// Inner classes for brevity
class MacButton implements Button {
    public void paint() { System.out.println("Painting Mac Button"); }
}

class MacCheckbox implements Checkbox {
    public void paint() { System.out.println("Painting Mac Checkbox"); }
}
