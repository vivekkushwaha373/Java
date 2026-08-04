# Single Responsibility Principle (SRP)

**Definition:** A class should have one, and only one, reason to change. 

In other words, every module or class should have responsibility over a single part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class, module, or function. All its services should be narrowly aligned with that responsibility.

## Why is it important?
- **Maintainability:** Smaller, well-organized classes are easier to search and understand.
- **Testability:** A class with one responsibility will have far fewer test cases.
- **Lower Coupling:** Less functionality in a single class will have fewer dependencies.

## Common Myths & Misconceptions
- **Myth 1: "A class should only have one method."** 
  *Reality:* A class can have many methods, as long as all those methods relate to the same single responsibility.
- **Myth 2: "SRP is only about classes."** 
  *Reality:* SRP applies to methods, classes, packages, and even entire microservices.
- **Myth 3: "Fewer lines of code means SRP is followed."** 
  *Reality:* You can have a 500-line class that has only one responsibility, and a 50-line class that has three. It's about *reasons to change*, not lines of code.

## Code Example Summary
Imagine an `Employee` class. 

### The Bad Way (`BadEmployee.java`)
```java
public class BadEmployee {
    public void calculatePay() { /* Business logic */ }
    public void saveToDatabase() { /* Persistence logic */ }
}
```
If the database structure changes, or if the salary calculation rules change, this class has to be modified. It has multiple reasons to change.

### The Good Way
We split these responsibilities into three separate classes:
```java
// Pure data holder
public class Employee { ... }

// Only handles calculations
public class SalaryCalculator { 
    public double calculatePay(Employee e, double taxRate) { ... } 
}

// Only handles database logic
public class EmployeeRepository { 
    public void save(Employee e) { ... } 
}
```
Now, if calculation logic changes, only `SalaryCalculator` changes. If DB changes, only `EmployeeRepository` changes.
