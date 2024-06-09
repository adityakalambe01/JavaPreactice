package array.w3resources.solution;

public class Q5SearchAnElement {
    static void searchElement(int[] myArray, int element){
        for (int arrayElement : myArray){
            if (arrayElement==element){
                System.out.println("Element is present");
                return;
            }
        }
        System.out.println("Element is not present");
    }
    public static void main(String[] args) {
        int[] myArray = new int[]{1,4,5,7,8,9,6,4,2,35};
        searchElement(myArray,4);
    }
}
