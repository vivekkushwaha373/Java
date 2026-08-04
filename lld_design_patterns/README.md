# Low-Level Design (LLD) & Design Patterns 🚀

Welcome to the ultimate guide for mastering Low-Level Design (LLD) and Object-Oriented Design Patterns. This repository is specifically structured to help you crack the Machine Coding / LLD rounds at top tech MNCs.

## 📖 Introduction for Beginners

### What is Low-Level Design (LLD)?
Low-Level Design is the process of breaking down a large system into smaller, manageable components (classes, interfaces, and methods). While *High-Level Design (HLD)* talks about Servers, Databases, and Load Balancers, **LLD talks about Classes, Objects, and relationships.**
In an interview, you are given a problem (e.g., "Design a Parking Lot" or "Design Tic-Tac-Toe") and you must write clean, extensible, and modular code using Object-Oriented Programming (OOP) principles.

### What are Design Patterns?
Design Patterns are proven, reusable solutions to commonly occurring problems in software design. They are not specific pieces of code, but rather templates or blueprints on how to solve a problem. 
Learning them prevents you from "reinventing the wheel" and gives you a common vocabulary to discuss code architecture with other engineers.

---

## 🗺️ Learning Path: Where to Start?

If you are new to LLD, **do not jump randomly**. Follow this strict learning order to build a solid foundation.

### Step 1: The Foundation (SOLID Principles)
Before you learn patterns, you must understand the rules of good code. 
*Navigate to:* `../solid_principles/` (Read all 5 principles in order: SRP -> OCP -> LSP -> ISP -> DIP).

### Step 2: Understand UML Diagrams
You need to know how to read the visual diagrams that explain class relationships.
*Navigate to:* [UML Understanding Guide](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/UML_UNDERSTANDING_GUIDE.md)

### Step 3: Core Design Patterns
The Gang of Four (GoF) patterns are divided into three categories. Study them in this specific order:

#### A. Creational Patterns (How objects are created)
1. **Singleton:** [creational/singleton/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/creational/singleton/README.md) *(Start here)*
2. **Factory & Abstract Factory:** [creational/factory_method/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/creational/factory_method/README.md) & [creational/abstract_factory/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/creational/abstract_factory/README.md)
3. **Builder:** [creational/builder/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/creational/builder/README.md)
4. **Prototype:** [creational/prototype/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/creational/prototype/README.md)

#### B. Structural Patterns (How objects are composed/assembled)
5. **Decorator:** [structural/decorator/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/structural/decorator/README.md) *(Extremely common in interviews)*
6. **Proxy:** [structural/proxy/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/structural/proxy/README.md)
7. **Adapter:** [structural/adapter/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/structural/adapter/README.md)
8. **Composite:** [structural/composite/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/structural/composite/README.md)
9. **Facade:** [structural/facade/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/structural/facade/README.md)

#### C. Behavioral Patterns (How objects communicate)
10. **Strategy:** [behavioral/strategy/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/behavioral/strategy/README.md) *(The most important behavioral pattern)*
11. **Observer:** [behavioral/observer/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/behavioral/observer/README.md)
12. **State:** [behavioral/state/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/behavioral/state/README.md)
13. **Chain of Responsibility:** [behavioral/chain_of_responsibility/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/behavioral/chain_of_responsibility/README.md)
14. **Command:** [behavioral/command/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/behavioral/command/README.md)

### Step 4: Machine Coding (LLD Case Studies)
Once you know the SOLID principles and Design Patterns, it's time to put them together to build entire systems.
1. **Tic-Tac-Toe:** [case_studies/tic_tac_toe/README.md](file:///c:/Users/vivek/Downloads/java/lld_design_patterns/case_studies/tic_tac_toe/README.md) *(Best starting project)*
2. *(More coming soon: Parking Lot, ATM, etc.)*

---

## 🛠️ How to read the code in this repo?
For every single pattern, you will find:
1. **README.md:** Explains the pattern, shows the UML diagram, and debunks common interview myths.
2. **BadCode.java:** Shows how a beginner might write the code (usually a giant `if-else` block or tightly coupled classes).
3. **GoodCode (Interfaces & Impl):** Shows the clean, scalable solution applying the specific pattern.

**Happy Coding & Good Luck with your Interviews!** 🚀
