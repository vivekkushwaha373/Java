package lld_design_patterns.behavioral.state;

/**
 * GOOD EXAMPLE: Concrete State (No Money).
 */
public class NoMoneyState implements State {
    
    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        // Transition to the next state!
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void dispense() {
        System.out.println("You need to insert a coin first.");
    }
}
