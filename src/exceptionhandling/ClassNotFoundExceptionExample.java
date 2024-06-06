package exceptionhandling;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("Demo");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
