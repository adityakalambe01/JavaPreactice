package Day_01_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01_PositiveNegative {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try{
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(bufferedReader.readLine());
            if(number>0){
                System.out.println("Positive");
            }else {
                System.out.println("Negative");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
