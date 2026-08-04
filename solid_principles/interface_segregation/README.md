# Interface Segregation Principle (ISP)

**Definition:** Clients should not be forced to depend upon interfaces that they do not use.

In other words, it is better to have many smaller, highly cohesive interfaces than one "fat" interface. If an interface has too many methods, classes that implement it might only need one or two of them, but they are forced to implement dummy versions of the rest.

## Why is it important?
- **Reduces Code Bloat:** Implementing empty methods clutters code and can lead to `UnsupportedOperationException`.
- **Improves Flexibility:** Small interfaces are easier to implement and compose together.
- **Minimizes Coupling:** Changes in one part of an application won't force recompilation/changes in unrelated parts.

## Common Myths & Misconceptions
- **Myth 1: "Every single method needs its own interface."** 
  *Reality:* This leads to interface fragmentation and makes the code unreadable. Interfaces should be cohesive groups of methods. If a client always uses `open()` and `close()` together, they belong in the same interface.
- **Myth 2: "ISP is just a subset of the Single Responsibility Principle."** 
  *Reality:* While they are related, SRP is about the implementation (a class should have one reason to change), whereas ISP is about the *client's perspective* (a client shouldn't see methods it doesn't care about).
- **Myth 3: "You only apply ISP to classes you author."** 
  *Reality:* ISP is heavily used when creating wrappers or adapters around third-party libraries that provide massive, monolithic interfaces.

## Code Example Summary
Imagine interfaces for office machines like printers, scanners, and fax machines.

### The Bad Way (`BadMachine.java`, `BadOldPrinter.java`)
```java
public interface BadMachine {
    void print();
    void scan();
    void fax();
}

public class BadOldPrinter implements BadMachine {
    public void print() { /* ... */ }
    public void scan() { throw new UnsupportedOperationException(); }
    public void fax() { throw new UnsupportedOperationException(); }
}
```

### The Good Way
We split the fat `BadMachine` interface into three smaller interfaces.
```java
public interface Printer { void print(); }
public interface Scanner { void scan(); }
public interface Fax { void fax(); }

// Advanced machines implement all they need
public class MultiFunctionMachine implements Printer, Scanner, Fax { ... }

// Simple machines only implement what they can actually do
public class OldPrinter implements Printer {
    public void print() { /* ... */ }
}
```
