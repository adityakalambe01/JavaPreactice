package Programs_02_arrays;

public class P01_LargestElement {
    public static void main(String[] args) {
        int[] numberArray = { 15,477,859,6,8,74,15,42,63};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numberArray.length; i++) {
            max = Math.max(max, numberArray[i]);
        }
        System.out.println(max);
    }
}
