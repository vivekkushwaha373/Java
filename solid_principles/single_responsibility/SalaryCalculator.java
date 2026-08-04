package solid_principles.single_responsibility;

/**
 * GOOD EXAMPLE: Complies with Single Responsibility Principle (SRP).
 * 
 * This class has ONLY ONE reason to change:
 * - If the rules or formula for calculating salary/taxes change.
 * 
 * It is completely independent of how the employee is stored in the database.
 */
public class SalaryCalculator {
    
    /**
     * Calculates the net pay for a given employee.
     * 
     * @param employee The employee data model
     * @param taxRate The applicable tax rate
     * @return The final calculated pay
     */
    public double calculatePay(Employee employee, double taxRate) {
        double salary = employee.getBaseSalary();
        return salary - (salary * taxRate);
    }
}
