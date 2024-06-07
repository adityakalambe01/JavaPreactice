package array.w3resources;

public class Q2SumOfValuesOfArray {
    static void calculateSum(int[] myArray){
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum+=myArray[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        calculateSum(new int[]{1,4,5,6,7,8,9,2,3});
    }
}
