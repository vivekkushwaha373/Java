package solid_principles.interface_segregation;

/**
 * BAD EXAMPLE: A "fat" interface violating ISP.
 * 
 * This interface forces ALL implementing classes to define methods 
 * for printing, scanning, and faxing, even if they don't support those features.
 */
public interface BadMachine {
    
    void print();
    
    void scan();
    
    void fax();
}
