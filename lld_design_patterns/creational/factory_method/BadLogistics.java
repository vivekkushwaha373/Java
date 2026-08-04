package lld_design_patterns.creational.factory_method;

/**
 * BAD EXAMPLE: The client code is tightly coupled to concrete classes.
 * 
 * If we need to add a "Ship" later, we have to modify the business logic here,
 * violating the Open/Closed Principle.
 */
public class BadLogistics {
    
    public void planDelivery(String type) {
        if ("ROAD".equalsIgnoreCase(type)) {
            // Tight coupling: Client directly calls the constructor
            Car car = new Car();
            car.deliver();
        } else if ("DIRT".equalsIgnoreCase(type)) {
            // Tight coupling
            Bike bike = new Bike();
            bike.deliver();
        } else {
            System.out.println("Unknown delivery type");
        }
    }
}
