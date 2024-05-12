package Programs_02_arrays;

public class P02_SmallestElement {
    public static void main(String[] args) {
        int[] numberArray = {1,2,3,4,5,6,7,8,9,10,154, -89};

        int minimumNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numberArray.length; i++) {
            minimumNumber = Math.min(minimumNumber, numberArray[i]);
        }

        System.out.println(minimumNumber);
    }
}
