package lld_design_patterns.behavioral.strategy;

/**
 * GOOD EXAMPLE: A concrete strategy.
 */
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;

    public PaypalStrategy(String email) {
        this.emailId = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal account: " + emailId);
    }
}
