package exceptionhandling.runatimeexception.arithmaticexception;

import java.math.BigDecimal;

public class ArithmaticExceptionCase2 {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal(11);
        BigDecimal number2 = new BigDecimal(17);

        BigDecimal result = new BigDecimal(0);

        try {
            result = number1.divide(number2);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        System.out.println(result);
    }
}
