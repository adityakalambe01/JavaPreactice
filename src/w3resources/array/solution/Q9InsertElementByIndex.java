package w3resources.array.solution;

import java.util.Arrays;

public class Q9InsertElementByIndex {
    static int[] insertElement(int[] myArray, int index, int element){
        if (myArray==null)
            return new int[]{};



        int[] newArray = new int[myArray.length+1];


        int originalArrayIndex = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (i==index){

            }else{
                newArray[i] = myArray[originalArrayIndex++];
            }
        }

        newArray[newArray.length-1] = myArray[myArray.length-1];


        newArray[index] = element;

        myArray = Arrays.copyOf(newArray, newArray.length);

        return myArray;
    }
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9};
        myArray = insertElement(myArray, 5, 25);

        System.out.println(
                Arrays.toString(myArray)
        );
    }
}
