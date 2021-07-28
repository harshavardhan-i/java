### Method overloading
* Java allows methods to have same name as long as their signatures are unique.
* **Method Signature** - Method name along with it's parameter is called method signature. Parameters can have different order or type etc.


### Method overriding
* When a subclass or a child class modifies a methods definition it's called method overriding
* Few rules to follow:
    - The method signature must be the same
    - The return has to be same or a subtype, **covariant return**
    - Access level of method should be the same of higher
    - Static or private methods cannot be overridden, can only be hidden

### Final 
* Final is a modifier and it means "unable to change"
* Usage
    - Makes variable a constant
    - Final methods cannot be overridden
    - Final class cannot be extendable 
* By convention constant are all caps and separated by underscore

