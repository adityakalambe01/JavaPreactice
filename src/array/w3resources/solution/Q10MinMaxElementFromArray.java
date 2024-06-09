package array.w3resources.solution;

public class Q10MinMaxElementFromArray {
    static void minMaxElement(int[] myArray){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            int element = myArray[i];
            if (element<min) min = element;
            if (element>max) max = element;
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }

    public static void main(String[] args) {
        minMaxElement(new int[]{1,4,5,7,6,3,0,9,8});
    }
}
