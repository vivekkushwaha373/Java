package lld_design_patterns.creational.factory_method;

/**
 * GOOD EXAMPLE: Concrete Product A.
 */
public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering cargo by land in a Car.");
    }
}
