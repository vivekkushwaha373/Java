# Understanding UML Class Diagrams

When preparing for SDE interviews at top MNCs, you will be expected to read and draw UML (Unified Modeling Language) Class Diagrams. In all the Design Pattern folders, we used **Mermaid JS** to generate these diagrams. 

Here is an in-depth guide to understanding the different relationships and arrows you will see in those diagrams.

---

## 1. The Class Box
A standard UML class is represented as a box with three sections:
1. **Top:** The Class Name. (If it has `<<interface>>` or `<<abstract>>` above it, it specifies the type).
2. **Middle:** The Attributes (Fields/Variables).
3. **Bottom:** The Methods (Functions/Behaviors).

**Visibility Markers:**
- `+` Public
- `-` Private
- `#` Protected
- `~` Package/Default

---

## 2. Relationships (The Arrows)

The arrows connecting the boxes are the most important part of UML. They define how classes interact with each other. They range from **Weakest** coupling to **Strongest** coupling.

### A. Dependency (Weakest)
* **Meaning:** "Uses a"
* **Arrow:** Dashed line with an open arrow (`..>`)
* **Explanation:** Class A *uses* Class B temporarily. If Class B changes, Class A might be affected, but Class A doesn't "own" Class B. Often, Class B is just passed as a parameter to a method in Class A.
* **Code Example:** A `Printer` class uses a `Document` class in its `print(Document doc)` method.

### B. Association
* **Meaning:** "Knows a" or "Has a"
* **Arrow:** Solid line (sometimes with an open arrow `-->`)
* **Explanation:** A generic relationship where one class contains a reference to another class as a class-level field. Both classes have their own lifecycles.
* **Code Example:** A `Teacher` has a `Student` (as a list). The student can exist without the teacher.

### C. Aggregation 
* **Meaning:** "Has a" (Weak Ownership)
* **Arrow:** Solid line with an **Empty Diamond** at the owner's end (`o--`)
* **Explanation:** A specialized form of Association. It represents a "whole-part" relationship, but the "part" can exist completely independently of the "whole".
* **Code Example:** A `Department` contains `Professor`s. If the `Department` is destroyed (e.g., the university closes the math department), the `Professor`s still exist and can move to another university.

### D. Composition (Strongest Ownership)
* **Meaning:** "Owns a" or "Is part of" (Strong Ownership)
* **Arrow:** Solid line with a **Filled Diamond** at the owner's end (`*--`)
* **Explanation:** A strict "whole-part" relationship. The "part" CANNOT exist without the "whole". The lifecycle of the part is entirely managed by the whole. If the whole is destroyed, the part is destroyed.
* **Code Example:** A `House` and a `Room`. If you demolish the `House`, the `Room` ceases to exist. 

### E. Inheritance / Generalization
* **Meaning:** "Is a"
* **Arrow:** Solid line with a **Hollow Triangle** pointing to the parent (`--|>`)
* **Explanation:** A child class extends a parent class. It inherits all properties and methods.
* **Code Example:** `Car extends Vehicle`

### F. Realization / Implementation
* **Meaning:** "Implements a"
* **Arrow:** Dashed line with a **Hollow Triangle** pointing to the interface (`..|>`)
* **Explanation:** A class implements an interface. It promises to fulfill the contract defined by the interface.
* **Code Example:** `Dog implements Animal`

---

## Quick Reference Summary (Mermaid Syntax used in this repo)

| Relationship | Meaning | Arrow / Symbol | Mermaid Syntax |
| :--- | :--- | :---: | :--- |
| **Dependency** | Uses | Dashed, Open Arrow | `..>` |
| **Association** | Knows | Solid, Open Arrow | `-->` |
| **Aggregation** | Has-a (Weak) | Solid, Empty Diamond | `o--` |
| **Composition** | Owns-a (Strong) | Solid, Filled Diamond | `*--` |
| **Inheritance** | Is-a (Class) | Solid, Hollow Triangle | `--\|>` |
| **Realization** | Is-a (Interface) | Dashed, Hollow Triangle | `..\|>` |

## Pro-Tip for Interviews
Interviewers often test if you understand the difference between **Aggregation** and **Composition**. Remember the rule of lifecycles: 
> *If the parent dies, does the child die? If yes, it's Composition. If no, it's Aggregation.*
