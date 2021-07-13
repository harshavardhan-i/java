* Java is an OOP-ing language.
* OOP makes it easier to mimic/organize/reuse the real world.
* Pillars of OO(Object oriented):
    1. Abstraction - To simplify 
    2. Encapsulation - 
    3. Inheritance - Build new objects from old objects.
    4. Polymorphism - 
* **Primitive Data Types** - Eight primitive data types.
    1. byte
    2. short
    3. int
    4. long
    5. float
    6. double
    7. boolean
    8. char
* **Everything else in java is an object**

* Instantiating - Creating an object is called instantiating.
    * Object is only created when used 'new' keyword.
    * While instantiating the object a constructor function is called.
    * Constructors can only by called while instantiating. 

* Class is a blue print/template for an object.
    * An object is an instance of a class.

* **Constructors:**
    * Used to initialize instance variables.
    * Every class has it's own default constructor.
    * Exact same name, as class itself.
    * Only way to call constructor is with new .
    * They have no return type, not even void.
    * Default constructor:  A "default" constructor is a "no-arg" constructor that is created by the compiler, in the event that you don't explicitly create one yourself.
    * Once explicit constructor is defined default constructor isn't used.

* The default values of variable differ based on their type:
    * Object - null
    * boolean - false
    * byte, short, int, long - 0
    * float, double - 0.0
    * char - '\u0000' or NUL/blank character (\u - escape sequence for unicode character).
* Only instance and static variables have default values. Any variable declared within method needs to be explicity initialized.
    