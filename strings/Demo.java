public class Demo {
    public static void main(String[] args){
        String s = new String("Hello World  ");
        String sub = s.substring(4, 10);
        String trimmed = s.trim();
        String upper = s.toUpperCase();
        char c = s.charAt(2);

        System.out.println(s);
        System.out.println(sub);
        System.out.println(trimmed);
        System.out.println(upper);
        System.out.println(c);

        // String concatenate with numbers
        int employeeId = 2812;
        int deptId = 98;
        System.out.println(employeeId + deptId); // Prints 2910
        System.out.println(employeeId + ":" + deptId); // Prints 2812:98
        System.out.println(employeeId + deptId + ":" + employeeId + deptId); 
        // The line above prints 2910:281298

        // String builder 
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("Harsh!");
        System.out.println(sb);

    }
}