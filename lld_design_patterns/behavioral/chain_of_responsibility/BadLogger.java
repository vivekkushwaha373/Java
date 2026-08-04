package lld_design_patterns.behavioral.chain_of_responsibility;

/**
 * BAD EXAMPLE: A class responsible for all log levels.
 * 
 * If we add a new log level (like DEBUG or FATAL), we have to modify
 * this class and add more conditions. This violates the Single Responsibility
 * and Open/Closed principles.
 */
public class BadLogger {
    
    public static int INFO = 1;
    public static int ERROR = 2;

    public void logMessage(int level, String message) {
        if (level == INFO) {
            System.out.println("Standard Console::Logger: " + message);
        } else if (level == ERROR) {
            System.out.println("Standard Console::Logger: " + message);
            System.out.println("Error Console::Logger: " + message);
        }
    }
}
