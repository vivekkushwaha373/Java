package lld_design_patterns.behavioral.chain_of_responsibility;

/**
 * GOOD EXAMPLE: Concrete Handler 2.
 */
public class ErrorLogger extends Logger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger (Writing to File): " + message);
    }
}
