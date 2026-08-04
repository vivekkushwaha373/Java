package lld_design_patterns.creational.factory_method;

/**
 * GOOD EXAMPLE: Concrete Product B.
 */
public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering small package quickly by Bike.");
    }
}
