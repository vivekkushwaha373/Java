package lld_design_patterns.behavioral.strategy;

/**
 * BAD EXAMPLE: Using a giant conditional block for behaviors.
 * 
 * Adding a new payment method (like Crypto or UPI) requires 
 * modifying this exact class, violating OCP.
 */
public class BadPaymentProcessor {
    
    public void processPayment(String type, int amount) {
        if ("CREDIT_CARD".equals(type)) {
            System.out.println("Processing credit card payment for $" + amount);
            // Complex CC logic here
        } else if ("PAYPAL".equals(type)) {
            System.out.println("Processing PayPal payment for $" + amount);
            // Complex PayPal logic here
        } else {
            System.out.println("Unknown payment method");
        }
    }
}
