package solid_principles.open_closed;

/**
 * BAD EXAMPLE: Violates Open/Closed Principle (OCP).
 * 
 * If we need to add a new discount type (e.g., "StudentDiscount" or "SeasonalDiscount"),
 * we are FORCED to modify this existing class by adding more if/else statements.
 * This class is NOT closed for modification.
 */
public class BadDiscountCalculator {
    
    /**
     * Calculates discount based on string type.
     * 
     * @param customerType Type of customer (e.g., "REGULAR", "VIP")
     * @param amount The original amount
     * @return The final discounted amount
     */
    public double calculateDiscount(String customerType, double amount) {
        if ("REGULAR".equalsIgnoreCase(customerType)) {
            // Regular customers get no discount
            return amount;
        } else if ("VIP".equalsIgnoreCase(customerType)) {
            // VIP customers get 10% off
            return amount * 0.90;
        } else if ("EMPLOYEE".equalsIgnoreCase(customerType)) {
            // Employees get 20% off
            return amount * 0.80;
        }
        
        // If we add a new type, we have to modify this code!
        return amount;
    }
}
