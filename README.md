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

#Singleton Pattern

The Singleton Pattern ensures a class has only one instance , and provides a global access point to it.
Depends on your application you have three ways to inicialize a Singleton class actually you have three ways to create one. First is the classic one that is not thread safe so you don't want to use this method of creation of singleton class if you are dealing with multithreaded app. Then there is the other way of creating a singleton class that is thread safe and fast and that is staticly creating a singleton instance. And the third way of creating it is using the synhronizd keyword but it is expensive, it takes more time to run then unsynhronized code.

#State Pattern

The State Pattern allows an object to alter it's behavior when it's internal state changes. The object will appear to change it's class.
- The pattern encapsulates state into separate classes
- The context delegates to the current state to handle requests 
- Once a request is handled, the current state may change.
- Each state has different behavior
Design Principles in here - (encapsulate what varies, favor composition over inheritance, keep a class closed for modification but open for extension)

#The Collection Pattern (Iterator)

The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing it's underlying representation. (Based on Design Principle #6 - A class should have only one reason to change)

#The Factory Method Pattern

The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
