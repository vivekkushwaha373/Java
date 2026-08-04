package lld_design_patterns.creational.singleton;

/**
 * GOOD EXAMPLE: A thread-safe Singleton using "Double-Checked Locking".
 */
public class ThreadSafeSingleton {

    // The volatile keyword ensures that multiple threads handle the instance 
    // variable correctly when it is being initialized.
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("ThreadSafeSingleton Instance Created!");
    }

    public static ThreadSafeSingleton getInstance() {
        // First check (no locking) - makes it fast for subsequent calls
        if (instance == null) {
            // Lock only on the first initialization
            synchronized (ThreadSafeSingleton.class) {
                // Second check (with locking) - prevents race conditions
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
