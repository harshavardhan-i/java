### Stack and Frames
 * Everytime a method is called a frame is created on top of stack
 * This frame holds method parameters and the variables declared within
 * Frame holds primitive variable values and a reference to objects in heap
 * If instance variable is used within method JVM looks for it within frame if not found it goes to the object that invoked it within heap and looks for it
 * Once methods are executed they pop off the stack and within heap they are eligible for garbage collection

### 'this' keyword
 * Keyword 'this' is a referece to the object/instance itself
 * 'this' lets JVM bypass frame search and goes directly to the object within heap
 * When method parameter names are identical to instance variable only parameters within the frame(local variables) gets affected
 * Chaining constructors: Done using this(). Rules
    - this(); has to be the first line within the constructor
    - this() cannot be called within a method

### Scope
 * Scope referes to when variables come alive, available/when they can be used and when they die
 * Different level of scope
   - Static/Class variables
   - Instance variables
   - Local variables
 * Local does not always mean method variable, could be within loop or if block etc
 * {} also define the scope of members within it
 * local-most variable means which variable would be used before other