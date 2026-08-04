package lld_design_patterns.creational.singleton;

/**
 * GOOD EXAMPLE: Enum Singleton (Recommended by Joshua Bloch in Effective Java).
 * 
 * This is the safest way to implement Singleton in Java.
 * It provides implicit support for thread safety and guards against 
 * multiple instantiations via Serialization and Reflection.
 */
public enum EnumSingleton {
    
    INSTANCE; // The one and only instance

    // You can add properties and methods just like a normal class
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public void doSomething() {
        System.out.println("Enum Singleton is doing something!");
    }
}
