package Day_01_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02_EvenOdd {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number % 2 == 0) {
                System.out.println("Even Number");
            }else {
                System.out.println("Odd Number");
            }
        }catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
}
