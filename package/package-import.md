### Packages
 * It helps organise classes
    - It makes it easier to find and use similar types
    - Helps avoid naming conflicts
    - Hleps control access to code 
 * It is a code folder, it bundles groups of related types together.
 * To avoid conflict with libraries with common package structure we create unique one, which tends to make using this classes within tedious 
 * package <name> has to be the first line of code statement
 * package statemet cannot be a wildcard
 * Import helps shorten these long class names
 * By default we have access to two packages:
   - The package we are working in
   - The package called 'java.lang' - contains System, String etc.

### Imports
 * Imports does not increase the bytecode size, It just eases the development
 * Import might increase compile time but that's it
 * Import SomeClass.*;
   - Asterisk imports all the classes within that package 
   - Asterisk does not match subfolders or subset of the classes
 * If two import packages have the same class to specifiy which to use we don't use *, it has to be named explicitly and imported 