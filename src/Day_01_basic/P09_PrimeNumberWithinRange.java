package Day_01_basic;

import custom.Used;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09_PrimeNumberWithinRange {
    static boolean checkPrime(int number) {
        if (number<=1) return false;
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
    static void printPrimeNumberWithinRange(int start, int end){
        for(int i=start; i<=end; i++){
            if (checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int start = 0, end = 0;
        try {
            Used.inputNumberMessage();
            start = Integer.parseInt(bufferedReader.readLine());
            Used.inputNumberMessage();
            end = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }

        P09_PrimeNumberWithinRange.printPrimeNumberWithinRange(
                Math.min(start, end),
                Math.max(start, end)
        );

    }
}
