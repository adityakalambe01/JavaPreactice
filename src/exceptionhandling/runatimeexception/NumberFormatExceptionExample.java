package exceptionhandling.runatimeexception;

@FunctionalInterface
interface NumberFormatExceptionInterface{
    void checkNumber(String number);
}

public class NumberFormatExceptionExample {


    public static void main(String[] args) {
        NumberFormatExceptionInterface numberFormatExceptionInterface = (number) ->{
            System.out.println("program started");

            try {
                System.out.println(Integer.parseInt(number));
            }catch (NumberFormatException e){
                System.out.println(e);
            }

            System.out.println("program ended");
        };


        numberFormatExceptionInterface.checkNumber("25");

        System.out.println();

        numberFormatExceptionInterface.checkNumber("123r");
    }
}
