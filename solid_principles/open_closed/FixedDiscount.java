package solid_principles.open_closed;

/**
 * GOOD EXAMPLE: Complies with OCP.
 * 
 * Another extension. We added a flat-rate discount without touching 
 * the PercentageDiscount class or the ShoppingCart class.
 */
public class FixedDiscount implements DiscountStrategy {

    private double discountAmount;

    public FixedDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double amount) {
        if (amount > discountAmount) {
            return amount - discountAmount;
        }
        // If discount is bigger than amount, return 0 instead of negative
        return 0;
    }
}
