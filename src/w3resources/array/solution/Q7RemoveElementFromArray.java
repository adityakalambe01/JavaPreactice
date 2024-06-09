package w3resources.array.solution;

import java.util.Arrays;

public class Q7RemoveElementFromArray {
    static int[] removeElement(int[] myArray, int element){
        int[] newArray = new int[myArray.length];

        int index = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]!=element){
                newArray[index++] = myArray[i];
            }
        }

        myArray = Arrays.copyOf(newArray, index);
        return myArray;
    }
    public static void main(String[] args) {
        int[] myArray = new int[]{1,4,5,8,9,6,5,7,8,9};
        myArray = removeElement(myArray, 9);
        System.out.println(
                Arrays.toString(myArray)
        );
    }
}
