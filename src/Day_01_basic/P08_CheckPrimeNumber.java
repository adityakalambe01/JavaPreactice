package Day_01_basic;

import custom.Used;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P08_CheckPrimeNumber {
    static void checkPrime(int number){
        boolean isPrime = true;
        if(number <= 1){
            isPrime = false;
        }else{
            //prime number logic
            for(int i = 2; i <= Math.sqrt(number) ; i++){
                if (number%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(
                isPrime ? "Prime" : "Not Prime"
        );
    }
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        try{
            Used.inputNumberMessage();

            number = Integer.parseInt(bufferedReader.readLine());

        }catch (IOException e){
            e.printStackTrace();
        }

        P08_CheckPrimeNumber.checkPrime(number);
    }
}
