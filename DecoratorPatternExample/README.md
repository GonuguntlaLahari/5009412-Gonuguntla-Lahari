# Decorator Design Pattern Example 5

It allows behavior to be added to individual objects, dynamically, without affecting the behaviour of other objects from the same class.

## Characteristics
- Promotes flexiblity and extensiblity, by allowing developers to compose objects with different combinations of functionalities at runtime.
- It follows open/closed principle, as new decorators can be added without modifying existing code.

## Components
1. Component Interface - Abstract Class Or Interface that defines the common interface for both the concrete components and decorators.
2. Concrete Component - These are basic objects to which we want to add new behavior or responsiblities.
3. Decorator - Abstract Class that implements the Common Interface, and has a reference to a Component Object.
4. Concrete Decorator - Concrete classes that extend the Decorator Class. They add specific behaviors or responsiblities to the Component.
