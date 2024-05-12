package Day_01_basic;

import custom.Used;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P04_SumOfNumberInRange {
    static void usingIteration(int start, int end){
        Used.iteration();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum+=i;
        }
        System.out.println("The sum of number from "+start+" to "+end+" is "+sum);
    }


    static void usingFormula(int start, int end){
        Used.formula();
        System.out.println("The sum of number from "+start+" to "+end+" is "+
                (end*(end+1)/2 - start*(start-1)/2)
        );
    }
    public static void main(String[] args) {
        int start = 0, end = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //taking user input
        try{
            Used.takeInputMessage(1);
            start = Integer.parseInt(bufferedReader.readLine());

            Used.takeInputMessage(2);
            end = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }

        P04_SumOfNumberInRange.usingIteration(Math.min(start,end),
                                              Math.max(start,end)
        );

        P04_SumOfNumberInRange.usingFormula(Math.min(start,end),
                                            Math.max(start,end)
        );
    }
}
