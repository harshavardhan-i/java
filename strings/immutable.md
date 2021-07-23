* Strings are immutable - Once created they cannot be changed
* Methods like toUpper creates new string, does not modify the original string. To uppercase a variable it needs to be reassigned.
* Since String is immutable and concatnation and reassignments leave a lot of objects unreferenced
* Java APIs:
    - StringBuilder: Not thread-safe but mutable, should be used when concurrency isn't there 
    - StringBuffer: They are thread-safe and mutable 