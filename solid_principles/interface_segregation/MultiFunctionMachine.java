package solid_principles.interface_segregation;

/**
 * GOOD EXAMPLE: Complies with ISP.
 * 
 * An advanced machine can simply implement MULTIPLE small interfaces.
 * It's not forced to depend on things it doesn't use; it explicitly 
 * chooses to support all these features.
 */
public class MultiFunctionMachine implements Printer, Scanner, Fax {

    @Override
    public void print() {
        System.out.println("Printing in high resolution color...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document to PDF...");
    }

    @Override
    public void fax() {
        System.out.println("Sending fax over telephone line...");
    }
}
