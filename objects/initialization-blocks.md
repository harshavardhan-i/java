### Initialization blocks
* It's an explicit block of code that runs every time an new object is created.
* Helps to initialize variables, specially when multiple constructors are present.
* We can have multiple initialization blocks.

* Invocation order: After object is created
    * constructor is called
    * based on the order they are listed(placed within code) initialization block or inline initialization runs first
    * then constructor code runs and initializes

* Helps write complex logic and runs for every object. 