package solid_principles.open_closed;

/**
 * GOOD EXAMPLE: Abstraction that enables the Open/Closed Principle.
 * 
 * By defining this interface, we can create as many discount strategies 
 * as we want in the future WITHOUT modifying any existing code.
 */
public interface DiscountStrategy {
    
    /**
     * Calculates the discounted amount.
     * 
     * @param amount The original total amount.
     * @return The amount after applying the specific discount.
     */
    double applyDiscount(double amount);
}
