package lld_design_patterns.creational.abstract_factory;

// --- Abstract Factory ---

/**
 * GOOD EXAMPLE: The Abstract Factory interface.
 * It declares creation methods for EACH abstract product in the family.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
