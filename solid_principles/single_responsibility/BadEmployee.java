package solid_principles.single_responsibility;

/**
 * BAD EXAMPLE: Violates Single Responsibility Principle (SRP).
 * 
 * This class has THREE reasons to change:
 * 1. If employee properties (like adding an address) change.
 * 2. If the logic for calculating salary changes.
 * 3. If the database persistence mechanism changes (e.g., SQL to NoSQL).
 */
public class BadEmployee {
    
    private String name;
    private double baseSalary;

    public BadEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // 1st Responsibility: Managing Employee properties
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // 2nd Responsibility: Business logic (Calculating pay)
    // If tax rules change, this class has to change.
    public double calculatePay(double taxRate) {
        return baseSalary - (baseSalary * taxRate);
    }

    // 3rd Responsibility: Database persistence
    // If we switch from MySQL to MongoDB, this class has to change.
    public void saveToDatabase() {
        System.out.println("Saving " + this.name + " to the database...");
        // DB connection logic would go here
    }
}
