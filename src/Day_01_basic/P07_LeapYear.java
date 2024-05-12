package Day_01_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P07_LeapYear {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = 0;

        //take input from user
        try{
            System.out.print("Enter year: ");
            year = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }

        //leap year logic
        if (year%400==0 || (year%4 == 0 && year%100 != 0) ){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }
    }
}
