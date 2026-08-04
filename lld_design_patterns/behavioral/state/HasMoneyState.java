package lld_design_patterns.behavioral.state;

/**
 * GOOD EXAMPLE: Concrete State (Has Money).
 */
public class HasMoneyState implements State {

    private VendingMachine machine;

    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You already inserted a coin. Please wait.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing your item...");
        // Transition back to the initial state!
        machine.setState(machine.getNoMoneyState());
    }
}
