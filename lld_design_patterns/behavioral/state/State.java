package lld_design_patterns.behavioral.state;

/**
 * GOOD EXAMPLE: The State interface.
 * Defines all actions that can happen to the VendingMachine.
 */
public interface State {
    void insertCoin();
    void dispense();
}
