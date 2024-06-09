package w3resources.array.solution;

import java.util.Arrays;

public class Q11ReverseIntegerArray {
    static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            arr[i] ^= arr[arr.length - i - 1];
            arr[arr.length - i - 1]^= arr[i];
            arr[i]^= arr[arr.length - i - 1];
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
