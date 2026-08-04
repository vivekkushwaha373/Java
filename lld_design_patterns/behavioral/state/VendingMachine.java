package lld_design_patterns.behavioral.state;

/**
 * GOOD EXAMPLE: The Context.
 * 
 * It delegates all work to the current State object.
 */
public class VendingMachine {
    
    private State noMoneyState;
    private State hasMoneyState;

    private State currentState;

    public VendingMachine() {
        // Initialize all possible states, passing 'this' so they can trigger transitions
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        
        // Initial state
        currentState = noMoneyState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    // Delegate to the current state
    public void insertCoin() {
        currentState.insertCoin();
    }

    // Delegate to the current state
    public void dispense() {
        currentState.dispense();
    }

    // Getters for states
    public State getNoMoneyState() { return noMoneyState; }
    public State getHasMoneyState() { return hasMoneyState; }
}
