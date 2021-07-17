public class Person {
    {
        personCount = 10;
    }

    // Static initialization block
    static {
        personCount = 20;
    }

    // Static variable
    private static int personCount = 1000;
    {
        personCount = 30;
    }

    // Static initialization block
    static {
        personCount = 40;
    }

    public static void main(String args[]) {
       System.out.println(Person.personCount); 
       Person p = new Person();
       System.out.println(Person.personCount);
       Person.personCount = 100; 
       p = new Person();
       System.out.println(Person.personCount);
    }
}