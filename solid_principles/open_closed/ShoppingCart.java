package solid_principles.open_closed;

/**
 * GOOD EXAMPLE: Complies with OCP.
 * 
 * The ShoppingCart depends on the DiscountStrategy abstraction.
 * It does not care WHICH specific strategy is passed to it.
 * 
 * If a new discount rule is invented tomorrow, this ShoppingCart 
 * class remains 100% UNCHANGED (Closed for modification).
 */
public class ShoppingCart {
    
    private double totalAmount;
    private DiscountStrategy discountStrategy;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // We can inject ANY discount behavior at runtime
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal() {
        if (discountStrategy == null) {
            return totalAmount; // No discount
        }
        return discountStrategy.applyDiscount(totalAmount);
    }
}
