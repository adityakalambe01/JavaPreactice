package Day_01_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P03_SumOfNNaturalNumber {

    static void usingFormula(int number){
        System.out.println("Using formula");
        System.out.println(
                "The sum of first "+number+" natural numbers is "+
                number*(number+1)/2
        );
    }

    static  void usingIteration(int number){
        System.out.println("Using iteration");
        int sum = 0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println(
                "The sum of first "+number+" natural numbers is "+sum
        );
    }

    static int usingRecursion(int number){
        if (number == 0) return 0;
        return number + usingRecursion(number - 1);

    }
    
    public static void main(String[] args) {
        int number = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.print("Enter the n\'th number: ");
            number = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        P03_SumOfNNaturalNumber.usingFormula(number);

        P03_SumOfNNaturalNumber.usingIteration(number);

        System.out.println("Using Recursion\n"+
                "The sum of first "+number+" natural numbers is "+ P03_SumOfNNaturalNumber.usingRecursion(number));
    }
}
