package lld_design_patterns.behavioral.state;

/**
 * BAD EXAMPLE: Using flags/enums and giant conditional blocks.
 * 
 * Adding a new state (like "OUT_OF_STOCK") means we have to modify EVERY SINGLE 
 * method in this class to add another `if (state.equals("OUT_OF_STOCK"))`.
 */
public class BadVendingMachine {
    
    private String state = "NO_MONEY";

    public void insertCoin() {
        if ("NO_MONEY".equals(state)) {
            System.out.println("Coin inserted.");
            state = "HAS_MONEY";
        } else if ("HAS_MONEY".equals(state)) {
            System.out.println("You already inserted a coin!");
        }
    }

    public void dispense() {
        if ("NO_MONEY".equals(state)) {
            System.out.println("You need to pay first.");
        } else if ("HAS_MONEY".equals(state)) {
            System.out.println("Dispensing item...");
            state = "NO_MONEY";
        }
    }
}
