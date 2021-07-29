* Interfaces are pseudo classes
* Modifier Interface is used instead of class
* Interface can only have methods with following modifiers:
    - default
    - static
    - abstract
* Interfaces can only have variables with following modifiers:  
    - public
    - static
    - final
* Cannot be instantiated
* Classes 'implement' interfaces
* Classes can implement multiple interfaces
    - In case same method is present in multiple classes being implemented it must be defined in implementing class.
* An interface can extend another interface
* All abstract methods has to be defined in implementing call
* 'default' methods are normal method with modifier, helps with backwards compatibility 
    - If a new abstract method is introduced in interface all implementing classes have to update it 
    - To avoid this we use default: backwards compatibility
* Variable reference can be typed by interface types.
*  all interface methods are public, even if they don't use the public keyword.
