public class CalculateMean {
    public static void mean(double[] myArray){
        double sum = 0;
        for(int i = 0; i < myArray.length; i++){
            sum = sum + myArray[i];
        }
        System.out.println(sum/ myArray.length);


    }
    public static void main(String[] args) {
        mean(new double[]{1,2,3,4,5,6,7,8,9,10});
    }
}
