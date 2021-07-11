### What is java
* It's a platform and a programming language
* Designed to be:
    * Simple, OOP and familiar(Syntax similar to C++)
    * Robust and secure - Throws error if any at compile time
    * Platform independent/agnostic - Java source code is compiled to bytecode.
    * Interpreted, threaded and dynamic
    * high performing

### Java Platform
* JVM: Java virtual machine - JDK includes JVM.
* API: application programming interface - Bundled java libraries that come with JDK.
* Source code uses APIs, which in turn runs on JVM, which in turn directly interacts with OS/Hardware.
* APIs and JVM combined are called JRE.
* Platform flow:
    1. Java source code converted to bytecode by java compiler.
    2. Bytecode runs on top of JVM.
    3. JVM converts bytecode to machine language.
* Bytecode - It's a computer object code processed by program; usually a virtual machine.
* Java platform is able to run many different languages that were built specifically for the JVM (including Groovy, Clojure, Scala, and more!)

### Editions and Versions of Java
* Different combinations of OS and Hardware needs different JVM versions.
* There are three editions:
    * JME: Java micro edition - Used for IoTs and embedded systems
    * JSE: Java standard edition - Used for desktop applications
        * JFX: Java FX is used to build GUI, Bundled with JSE.
    * JEE: Java enterprise edition - Used for distributed systems, web etc.
* Java is backwards compatible.


