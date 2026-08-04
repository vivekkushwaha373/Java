# Open-Closed Principle (OCP)

**Definition:** Software entities (classes, modules, functions, etc.) should be **open for extension**, but **closed for modification**.

This means you should be able to add new functionality to a system without having to modify the existing, previously tested code. This is usually achieved through polymorphism and abstractions (interfaces/abstract classes).

## Why is it important?
- **Reduced Risk of Bugs:** If you don't modify existing code, you are much less likely to break existing functionality.
- **Easier Feature Additions:** New features can be cleanly added by writing new classes that implement existing interfaces.
- **Improved Code Maintainability:** Code doesn't become a massive, untamed jungle of `if-else` or `switch` statements over time.

## Common Myths & Misconceptions
- **Myth 1: "Code can never be modified again once written."** 
  *Reality:* If there's a bug in existing code, you definitely modify it! OCP applies to *adding new features*, not fixing bugs.
- **Myth 2: "You must anticipate every possible future change."** 
  *Reality:* It's impossible to predict everything. OCP is often applied *after* you notice a pattern of changes (e.g., modifying the same `switch` statement for the third time). Don't over-engineer abstractions from day one.
- **Myth 3: "Abstract classes/Interfaces solve everything."** 
  *Reality:* Sometimes, simple configuration or injecting functions (in functional programming) is a better way to achieve OCP than creating massive class hierarchies.

## Code Example Summary
Imagine an e-commerce system that calculates discounts for a shopping cart.

### The Bad Way (`BadDiscountCalculator.java`)
```java
public class BadDiscountCalculator {
    public double calculate(String type, double amount) {
        if ("VIP".equals(type)) return amount * 0.9;
        else if ("EMPLOYEE".equals(type)) return amount * 0.8;
        return amount; // Modifying this class is required for new types!
    }
}
```

### The Good Way
We introduce an abstraction: `DiscountStrategy`. We **extend** the system without **modifying** any existing classes!
```java
public interface DiscountStrategy {
    double applyDiscount(double amount);
}

// New features are added as NEW classes
public class PercentageDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) { ... }
}

public class ShoppingCart {
    private DiscountStrategy strategy;
    // We can swap strategies without touching this code
    public double calculateTotal() { return strategy.applyDiscount(total); }
}
```
