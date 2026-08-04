package solid_principles.interface_segregation;

/**
 * BAD EXAMPLE: Violates Interface Segregation Principle (ISP).
 * 
 * This old printer only knows how to print. However, because it implements 
 * the fat `BadMachine` interface, it is FORCED to provide an implementation 
 * for scan() and fax(), which it cannot actually do.
 */
public class BadOldPrinter implements BadMachine {

    @Override
    public void print() {
        System.out.println("Printing document in black and white...");
    }

    @Override
    public void scan() {
        // Forced to implement this!
        throw new UnsupportedOperationException("This old printer cannot scan!");
    }

    @Override
    public void fax() {
        // Forced to implement this!
        throw new UnsupportedOperationException("This old printer cannot fax!");
    }
}
