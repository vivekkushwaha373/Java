package lld_design_patterns.behavioral.chain_of_responsibility;

/**
 * GOOD EXAMPLE: The Handler abstract class.
 * 
 * It manages the "chaining" logic. Subclasses only need to implement 
 * the actual work (`write` method).
 */
public abstract class Logger {
    public static int INFO = 1;
    public static int ERROR = 2;

    protected int level;

    // The next element in the chain of responsibility
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        // If this logger's level is equal to or less than the requested level, it handles it.
        if (this.level <= level) {
            write(message);
        }
        
        // Pass the request down the chain if there is a next logger
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    // Concrete classes must implement this
    protected abstract void write(String message);
}
