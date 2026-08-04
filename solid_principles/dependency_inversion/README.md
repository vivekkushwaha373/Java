# Dependency Inversion Principle (DIP)

**Definition:** 
1. High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces).
2. Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.

In simple terms, depend on interfaces rather than concrete classes. This helps to decouple your modules.

## Why is it important?
- **Decoupling:** Changes in low-level classes (like a specific database driver) won't break high-level business logic.
- **Testability:** It's incredibly easy to mock/stub dependencies when they are behind an interface.
- **Flexibility:** You can swap out implementations at runtime (e.g., switching from a `StandardKeyboard` to a `MechanicalKeyboard`).

## Common Myths & Misconceptions
- **Myth 1: "Dependency Inversion is the exact same thing as Dependency Injection (DI)."** 
  *Reality:* DI (passing dependencies through constructors) is a technique/tool. DIP is the *principle* that dictates you should inject *abstractions* rather than concrete classes. You can have DI without DIP, and DIP without DI.
- **Myth 2: "Every single class must have a matching interface."** 
  *Reality:* Creating an `IUser` interface for a pure `User` POJO/data-transfer-object is overkill and useless. DIP applies to services, repositories, and architectural boundaries, not simple data classes.
- **Myth 3: "DIP means no concrete classes can ever be instantiated."** 
  *Reality:* Somewhere in your application (usually the "Composition Root" or Main method), concrete classes must be instantiated. DIP just pushes this instantiation to the outermost edges of the system.

## Code Example Summary
Imagine a Computer that needs a Keyboard to function.

### The Bad Way (`BadComputer.java`, `StandardKeyboard.java`)
```java
public class StandardKeyboard {
    public void type() { /* ... */ }
}

public class BadComputer {
    private StandardKeyboard keyboard;

    public BadComputer() {
        // Tightly coupled: We are forced to use a StandardKeyboard!
        this.keyboard = new StandardKeyboard(); 
    }
}
```

### The Good Way
We introduce a `Keyboard` interface and use dependency injection.
```java
public interface Keyboard {
    void type();
}

public class MechanicalKeyboard implements Keyboard { ... }

public class Computer {
    private Keyboard keyboard;

    // Dependency Injection via constructor
    // The dependency is inverted! We depend on an abstraction.
    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
```
