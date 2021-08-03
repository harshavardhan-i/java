// Searching and sorting array
import java.util.Arrays;

public class ArrayExample {
    public static void main (String[] args){

        // Prints console/terminal passed arguments.
        for ( int i = 0; i < args.length; i++)
            System.out.println(args[i]);

        // Declare, instantiate and assign in single line
        int[] tempArray = { 1, 2, 3, 4, 5, 6, 7, 8};
        int[] temp = tempArray;

        // System array copy method, makes new object and points to it
        System.arraycopy( temp, 0, tempArray, 0, temp.length);
        temp = null;

        System.out.println(tempArray);
        printArray(tempArray);

        // Another way of instantiating
        int[] array = new int[10];
        printArray(array);

        // Sorting
        char[] letters = { 'a', 'c', 'e', 'b', 'd'};
        Arrays.sort(letters);
        // For each loops
        for( char letter : letters )    
            System.out.println(letter);
    }

    // Static method to loop through using varargs(ellipsis)
    public static void printArray(int... tempArray){
        // For each loop
        for(int ele : tempArray ){
            System.out.println(ele);
        }
    }
}