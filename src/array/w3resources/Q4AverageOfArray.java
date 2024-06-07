package array.w3resources;

public class Q4AverageOfArray {
    static double calculateSum(double[] myArray){
        double sum = 0;
        for (double number : myArray){
            sum+=number;
        }
        return sum;
    }

    static void calcualteAverage(double[] myArray){
        System.out.println(
                calculateSum(myArray) / myArray.length
        );
    }
    public static void main(String[] args) {
        calcualteAverage(new double[]{1,4,5,7,8,9,69,3,25});
    }
}
