package lld_design_patterns.structural.composite;

/**
 * GOOD EXAMPLE: The Component Interface.
 * 
 * Both Leaf nodes (Products) and Composite nodes (Boxes) will implement this.
 * The client can call getPrice() without caring what the actual class is.
 */
public interface Component {
    double getPrice();
}
