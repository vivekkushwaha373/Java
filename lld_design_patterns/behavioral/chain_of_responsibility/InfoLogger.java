package lld_design_patterns.behavioral.chain_of_responsibility;

/**
 * GOOD EXAMPLE: Concrete Handler 1.
 */
public class InfoLogger extends Logger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
