package lld_design_patterns.behavioral.strategy;

/**
 * GOOD EXAMPLE: The Context class.
 * 
 * It doesn't know HOW the payment is processed. It just delegates 
 * the work to the currently assigned strategy.
 */
public class ShoppingCart {
    
    private int amountToPay;

    public ShoppingCart(int amountToPay) {
        this.amountToPay = amountToPay;
    }

    // This method takes the strategy as a parameter (or we could set it via a setter).
    // The client decides which algorithm to use!
    public void executePayment(PaymentStrategy strategy) {
        // Delegate the algorithm to the strategy object
        strategy.pay(amountToPay);
    }
}
