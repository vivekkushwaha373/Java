package solid_principles.single_responsibility;

/**
 * GOOD EXAMPLE: Complies with Single Responsibility Principle (SRP).
 * 
 * This class has ONLY ONE reason to change:
 * - If the core attributes of an Employee change (e.g., adding a phone number).
 * 
 * It acts purely as a data holder (POJO / Model) without business or DB logic.
 */
public class Employee {
    
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
