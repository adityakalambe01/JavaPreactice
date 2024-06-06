package exceptionhandling.runatimeexception.indexoutofbound;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numberArray = {1,4,5,6,7,8};

        int result=-1;

        try{
            result = numberArray[50];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println(result);
    }
}
