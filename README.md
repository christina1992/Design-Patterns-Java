# Design-Patterns-CN
My own examples of some of the design patterns

<em>Design Patterns</em> are used to make your code more flexible and maintainable and are general solutions to common problems.
A pattern is a guideline for flexible and resilient code design.

#Strategy Pattern
The Strategy Pattern defines a family of algorithms,encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it. (Based on Design Principles #1 & #2. 1 - Identify the aspects of your code that VARY and separate them from what stays the same. 2 - Program to an interface not an implementation.

#Observer Pattern
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of it's dependents are notified and updated automaticly. (This pattern is one of the most commonly used patterns)
The advantage of this pattern is LOOSE COUPLING. The goal is to reduse the dependency between the subject and the objects, so that each can VARY independently of each other.
LOOSELY COUPLED - Any changes we make to the subject or the observer never affects the other. That's true loose coupling.
(Based on Design Principle #4 - We always want to strive for looslely coupled designs between objects that interact, beacuse loose coupling gives us the flexibility to vary our design without breaking the contract between interacting objects.

#Decorator Pattern
The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality. (Based on Design Principle #5 -open-close principle: Classes should be open for extension but closed for modification.)
