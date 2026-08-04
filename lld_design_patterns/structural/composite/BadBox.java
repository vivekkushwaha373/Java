package lld_design_patterns.structural.composite;

import java.util.List;

/**
 * BAD EXAMPLE: Not using polymorphism.
 * 
 * We are forced to use `instanceof` to check what type of object we are dealing with.
 * If we add a new type (like `Bag`), we have to modify this calculation logic!
 */
public class BadBox {
    
    // Can contain a mix of objects (Products and other BadBoxes)
    private List<Object> contents;
    
    public double calculateTotal() {
        double total = 0;
        for (Object item : contents) {
            if (item instanceof Product) {
                total += ((Product) item).getPrice();
            } else if (item instanceof BadBox) {
                total += ((BadBox) item).calculateTotal();
            }
            // Violates OCP!
        }
        return total;
    }
}
