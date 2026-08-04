package lld_design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * GOOD EXAMPLE: The Composite node.
 * 
 * It contains a list of Components (which can be Products or other Boxes!).
 * It delegates the work to its children.
 */
public class Box implements Component {

    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        // The magic of polymorphism: we don't care if 'child' is a Product or a Box.
        // If it's a Box, it will recursively call this same method on its children!
        for (Component child : children) {
            total += child.getPrice();
        }
        return total;
    }
}
