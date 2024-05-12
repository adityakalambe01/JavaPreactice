package Day_01_basic;

import custom.Used;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P05_GreatestAmongTwo {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int firstNumber=0, secondNumber=0;
        //Take input
        try {
            Used.takeInputMessage(1);
            firstNumber = Integer.parseInt(bufferedReader.readLine());

            Used.takeInputMessage(2);
            secondNumber = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(
                "The greatest number among "+firstNumber+" and "+secondNumber+" is "
                + (Math.max(firstNumber, secondNumber))
        );
    }
}
