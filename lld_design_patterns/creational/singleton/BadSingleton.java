package lld_design_patterns.creational.singleton;

/**
 * BAD EXAMPLE: A naive Singleton that is NOT thread-safe.
 */
public class BadSingleton {

    // Static variable to hold the one instance
    private static BadSingleton instance;

    // Private constructor prevents instantiation from other classes
    private BadSingleton() {
        System.out.println("BadSingleton Instance Created!");
    }

    /**
     * If two threads enter this method at the exact same time when instance is null,
     * BOTH will evaluate (instance == null) as true, and BOTH will create a new instance.
     * This violates the Singleton pattern.
     */
    public static BadSingleton getInstance() {
        if (instance == null) {
            instance = new BadSingleton();
        }
        return instance;
    }
}
