package _01_taking_input_from_user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedReaderClass {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int number = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException | NumberFormatException e){
            System.out.println(e);
        }
    }
}
