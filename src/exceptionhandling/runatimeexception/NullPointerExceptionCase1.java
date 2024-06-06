package exceptionhandling.runatimeexception;

public class NullPointerExceptionCase1 {
    public static void main(String[] args) {
        String s1 = null;
        try{
            System.out.println(s1.length());
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
