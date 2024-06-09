package array.w3resources.solution;

import java.util.Arrays;

public class Q8CopyArrayUsingIteration {

    public static void main(String[] args) {
        int[] myArray = {4,5,7,8,9,6,5,2,1,3,4};
        int[] coppedArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            coppedArray[i]=myArray[i];
        }

        System.out.println(
                Arrays.toString(coppedArray)
        );
    }
}
