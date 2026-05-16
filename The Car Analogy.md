# Thinking in Objects: The Car Analogy

Object-Oriented Programming (OOP) can feel abstract, but it is fundamentally a way to model the real world. Let’s break down the core concepts using something we all understand: **The Car.**

---

## 1. The Class: The Blueprint

A **Class** is the blueprint or design of the system. It defines what a car is and what it can do, but it is not a physical object yet.

> **Note:** You cannot drive a blueprint; you need something physical.
> 
> 

### The Blueprint Design



| **What a Car HAS (Attributes)** | **What a Car DOES (Methods)** |
| --- | --- |
| Brand, Model, Color | `drive()` |
| 4 Wheels, Engine, Steering | `honk()` |
| Number of Doors, Boot, Seats |  |

---

## 2. The Object: The Instance

An **Object** is a physical instance made from that blueprint. While the blueprint says "a car has a color," the Object specifies "this car is **Red**."

### Example Instance: The BMW m340i



* **Brand:** BMW


* **Model:** m340i


* **Wheels:** Rubber


* **Engine:** 2-liter 6-cylinder


* **Color:** Red


* **Doors:** 4


* **Boot:** 500L


* **Steering:** Round


* **Seats:** Heated



```java
// Creating the object in code
Car myCar = new Car();

```

### The Factory Analogy



* **`Car`**: The Blueprint (Class).


* **`Constructor`**: The assembly line inside the factory.


* **`new`**: The Factory itself (Creates the Object).


* **`myCar`**: The physical car (Object).



---

## 3. Four Pillars of OOP

### Abstraction

Abstraction hides the messy details. A user only needs to know how to use the "controls" without understanding the hundreds of lines of code running the engine.

* **`myCar.drive(4)`**: Drives 4 blocks.


* **`myCar.honk(3)`**: Honks 3 times.
The driver doesn't care *how* it honks, only that it *does*.



### Inheritance

Inheritance allows you to create specialized versions of a class. For example, an **Electric Car** is still a car, but it has a unique "flavor."

* **Reuses:** Brand, model, and wheels from the base `Car` class.


* **Changes:** The engine type becomes fixed as "Electric."


* **Adds:** New properties like `batteryLevel`.



```java
// Inheritance in action
class ElectricCar extends Car {
    int batteryLevel; 
}

```

### Polymorphism

Polymorphism allows the same method to behave differently based on the input. It is the ability of an action to take "many forms."

* **`drive(int block)`**: Drives a specific distance.


* **`drive(String direction)`**: Drives in a specific direction (e.g., "Left" or "Right").