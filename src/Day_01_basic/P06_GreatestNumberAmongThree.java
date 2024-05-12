package Day_01_basic;

import custom.Used;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P06_GreatestNumberAmongThree {
    public static void main(String[] args) {
        int firstNumber = 0, secondNumber = 0, thirdNumber = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //take input
        try {
            Used.takeInputMessage(1);
            firstNumber = Integer.parseInt(bufferedReader.readLine());

            Used.takeInputMessage(2);
            secondNumber = Integer.parseInt(bufferedReader.readLine());

            Used.takeInputMessage(3);
            thirdNumber = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(
                "The Greatest number among "+firstNumber+", "+secondNumber+" & "+thirdNumber+" is "
                + (Math.max(firstNumber,
                        Math.max(secondNumber, thirdNumber))
                  )
        );
    }
}
