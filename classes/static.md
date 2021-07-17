* **Static variables**: 
    - Static variable are also called Class variables, they are tied up to the class insted of object created by them
    - Static is a keyword and a modifier in java
    - Not recomended to access via object dot(.) method, should be tied to Class itself.
    - Class/Static varibles are created and initialized when JVM encounters Class itself, where as instance variables are created only when an instance/object is created.
    - Class itself is stored in a separate space than objects within Heap

* **Static/Class Methods**:
    - Defined just like class variables
    - Static/Class methods cannot access instance variables
    - Use:
        * To access/fetch static variables
        * To provide functionality without the need to create an instance/object
    - NULL referece variables throw NULLPointerExceptions when instance members are accessed, results in premature quitting
    - NULL Class references accessing a static member won't throw null point exception

* **Static Initialization Block**
    - Static blocks are run only once for class
    - It can only hold static members of the class
    - Can have multiple static initialization blocks
    - Multiple initialization blocks run in the order they are listed

* **All instance and static vaiables start with a default values**
