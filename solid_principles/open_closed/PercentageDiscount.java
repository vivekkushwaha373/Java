package solid_principles.open_closed;

/**
 * GOOD EXAMPLE: Complies with OCP.
 * 
 * This class represents a specific type of discount. It EXTENDS our system's capabilities.
 */
public class PercentageDiscount implements DiscountStrategy {

    private double percentage; // e.g., 10 for 10%

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * (percentage / 100));
    }
}
