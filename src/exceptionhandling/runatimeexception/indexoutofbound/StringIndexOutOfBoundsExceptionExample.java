package exceptionhandling.runatimeexception.indexoutofbound;

public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String myString = "AdityaKalambe";

        try {
            System.out.println(myString.charAt(101));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
