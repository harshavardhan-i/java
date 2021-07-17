// Creating an class
public class Car{
    // Inline initialization
    String color = "Red"; // Legal - Instance and static variable need not be initialized
    String type; // Default  value null.

    // Initialization block
    {
        color = "Blue";
    }

    // Explicit constructor defined.
    Car(String c, String t){
        color = c;
        type = t;
    }

    // Methods

    // Any variable within method needs to be initialized.
    // public void printVIN(){
    //     int vin;
    //     System.out.println(vin); // Compiler error.
    // }

    void start(int x, int y, int z){
        System.out.println("Get Started!");
    }

    void printDescription(){
        System.out.println("This is a "+color+" " + type);
    }

    public static void main( String[] args){
        // Declaring an object
        Car car1, car2, car3;
        // Creating an instance
        car1 = new Car("Red", "Sports");
        // car1.printVIN();
        car1.start(1, 2, 3);
        car1.printDescription();
    }
}

