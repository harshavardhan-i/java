public class Example {
    public static void main(String[] args){
        System.out.println("Instantiating object vs Declaring:");
        // Instantiating object
        String s = new String("Hello World!");
        String sub = s.substring(4, 10);
        String trimmed = s.trim();
        String upper = s.toUpperCase();
        char c = s.charAt(2);
        // Declaring object
        String b;
    }
}