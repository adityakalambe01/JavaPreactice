package Programs_02_arrays;

public class P03_SmallestAndLargestElement {
    public static void main(String[] args) {
        int[] numberArray = {1,5,4,8,7,9,5,4,3,6,8};
        int minimumNumber = Integer.MAX_VALUE, maximumNumber = Integer.MIN_VALUE;
        for (int i = 0; i < numberArray.length; i++) {
            maximumNumber = Math.max(maximumNumber, numberArray[i]);
            minimumNumber = Math.min(minimumNumber, numberArray[i]);
        }
        System.out.println("The minimum number is: " + minimumNumber);
        System.out.println("The maximum number is: " + maximumNumber);
    }
}
