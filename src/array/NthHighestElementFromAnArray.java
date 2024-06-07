package array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NthHighestElementFromAnArray {
    public static int[] removeDuplicates(int[] arr){
        int[] b = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                b[index++] = arr[i];
            }
        }
        b[index++] = arr[arr.length-1];
        arr = Arrays.copyOf(b,index);
        return arr;
    }

    public static void sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void getNthMaxElement(int[] myArray, int n){
        sortArray(myArray);
        myArray = removeDuplicates(myArray);
        if (n>=0 && n<=myArray.length){
            System.out.println("The n'th element is "+myArray[myArray.length-n]);
        }else {
            System.out.println("Out of range");
        }
    }
    public static void main(String[] args) throws IOException {
        int[] myArray = {7,8,9,4,5,6,1,2,3,5,6,4,8,7,9};
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter nth element to find out: ");
        getNthMaxElement(myArray, Integer.parseInt(myReader.readLine()));

    }
}
