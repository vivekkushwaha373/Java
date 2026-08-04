package lld_design_patterns.structural.composite;

/**
 * GOOD EXAMPLE: The Leaf node.
 * 
 * It has no children. It does the actual work (returning its price).
 */
public class Product implements Component {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
