# Liskov Substitution Principle (LSP)

**Definition:** Objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.

In simpler terms, if a class `B` is a subclass of `A`, then everywhere you use an `A`, you should be able to use a `B` without the program acting weird or crashing. A subclass must **honor the contract** established by its base class.

## Why is it important?
- **Predictable Behavior:** If you pass a subclass where a base class is expected, the code shouldn't break.
- **Stronger Abstractions:** Forces you to model relationships correctly (is-a vs. has-a or can-do).

## Common Myths & Misconceptions
- **Myth 1: "If it exists in the real world, it's valid in code (e.g., A Square is a Rectangle)."** 
  *Reality:* In geometry, a Square is a Rectangle. In code, if a Rectangle has independent `setWidth()` and `setHeight()` methods, a Square subclass violates LSP because changing a square's width must also change its height, breaking the expectations of the Rectangle class.
- **Myth 2: "Throwing `UnsupportedOperationException` is perfectly fine."** 
  *Reality:* If a subclass inherits a method and immediately throws `UnsupportedOperationException` (like a `Penguin` throwing it for `fly()`), it is a blazing red flag that LSP is being violated.
- **Myth 3: "LSP only applies to Object-Oriented Inheritance."** 
  *Reality:* LSP also applies to interfaces (implementations must honor the interface's contract) and even duck-typing in dynamic languages.

## Code Example Summary
A classic example involves birds.

### The Bad Way (`BadBird.java`, `BadPenguin.java`)
```java
public class BadBird {
    public void fly() { /* ... */ }
}

public class BadPenguin extends BadBird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}
```
If client code calls `fly()` on a list of `BadBird`s, it will crash when it hits a `BadPenguin`.

### The Good Way
We adjust our class hierarchy.
```java
public abstract class Bird {
    public void eat() { /* ... */ } 
    // No fly() method here!
}

public abstract class FlyingBird extends Bird {
    public void fly() { /* ... */ }
}

public class Sparrow extends FlyingBird { ... }
public class Penguin extends Bird { ... }
```
Now, if a method expects a `FlyingBird`, we can safely pass a `Sparrow`, but the compiler prevents us from passing a `Penguin`.
