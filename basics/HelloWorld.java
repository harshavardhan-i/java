// File name & Class name should be same
// To run the code:
    // javac fileName.java
    // java fileName
public class HelloWorld{

    // Method: Contains statements.
    // Return type: Void here
    // Modifiers: Immediately to the left of return type. 
    // Order of modifier dosen't matter. static public, public static. 
    // JVM start executing with the main method.
    // Rules for defining main method:
        // Modifiers for main should be public and static.
        // Should have return type void.
        // 'main' should be all lower case.
        // Should take String array as parameter.

    // Instance variable
    String welcmMsg = null;

    // Constructor
    HelloWorld(){
        welcmMsg = "Hello world!";
    }

    // Starting point for JVM
    public static void main(String[] args){
        
        // Object declaration
        HelloWorld obj = new HelloWorld();

        // Statements: Are instructions.
        System.out.println(obj.welcmMsg);

        System.out.print("Hello World");
        System.out.print("Hello World\n");
        System.out.println("Hello World");
    
    }
}