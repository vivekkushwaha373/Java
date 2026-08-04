package lld_design_patterns.behavioral.strategy;

/**
 * GOOD EXAMPLE: The Strategy interface.
 * All payment algorithms must implement this.
 */
public interface PaymentStrategy {
    void pay(int amount);
}
