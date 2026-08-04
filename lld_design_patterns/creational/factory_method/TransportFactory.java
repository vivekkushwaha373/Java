package lld_design_patterns.creational.factory_method;

/**
 * GOOD EXAMPLE: The Simple Factory.
 * 
 * It centralizes object creation. If object creation logic changes,
 * or new Transports are added, the client code using this factory 
 * doesn't need to change.
 */
public class TransportFactory {

    public static Transport createTransport(String type) {
        if ("ROAD".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("DIRT".equalsIgnoreCase(type)) {
            return new Bike();
        }
        
        throw new IllegalArgumentException("Unknown transport type.");
    }
}
