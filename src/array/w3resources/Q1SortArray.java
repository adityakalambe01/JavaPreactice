package array.w3resources;

import java.util.Arrays;

public class Q1SortArray {
    static void sortIntegerArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i; j < myArray.length-1; j++) {
                if (myArray[i]>myArray[j+1]){
                    myArray[i]^=myArray[j+1];
                    myArray[j+1]^=myArray[i];
                    myArray[i]^=myArray[j+1];
                }
            }
        }
        System.out.println(
                Arrays.toString(myArray)
        );
    }

    static void sortStringArray(String[] myArray){
        for (int i = 0; i < myArray.length; i++){
            for (int j = i; j < myArray.length-1; j++){
                if (myArray[i].compareTo(myArray[j+1])>0){
                    String temp = myArray[i];
                    myArray[i] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(myArray));
    }

    public static void main(String[] args) {
        sortIntegerArray(new int[]{17,5,8,4,9,6,3,2,1,5});

        sortStringArray(new String[]{"aditya","adiA","b","a"});
    }
}
