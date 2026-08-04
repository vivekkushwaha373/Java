package solid_principles.single_responsibility;

/**
 * GOOD EXAMPLE: Complies with Single Responsibility Principle (SRP).
 * 
 * This class has ONLY ONE reason to change:
 * - If the data storage mechanism changes (e.g., moving to a new database).
 * 
 * It takes an Employee object and handles all persistence logic.
 */
public class EmployeeRepository {
    
    /**
     * Saves the employee record to the database.
     * 
     * @param employee The employee data model to be saved
     */
    public void save(Employee employee) {
        // Here we would implement the actual DB connection and INSERT statement
        System.out.println("Successfully saved employee: " + employee.getName() + " to the database.");
    }
}
