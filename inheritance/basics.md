### Compositon
* When a class uses other class objects as members
* Helps with code reuse

### Inheritance 
* Classes are extensible 
* Helps implement DRY principle
* A class can inherit another class by using extend keyword 
* When a class extends another class it inherits all the attributes and behaviors of the super class
* Java is a single interitance OOP language
* AKA parent child class
* Parent class must be defined before child class

### Chaining Constructors
* While extending other class JRE adds a 'super()' symbol to the bytecode
* This **super** is a constructor call to the parent/super class
* This can be done explicitly as well, but should be the first statement within the child constructor
* super can also be used to access super class methods.
* Errors like symbol missing can be used diagnose issue
* Cannot access ancestors by chaining super like super.super.method()
