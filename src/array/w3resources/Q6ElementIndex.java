package array.w3resources;

public class Q6ElementIndex {
    static int getElementIndex(int[] myArray, int element){
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]==element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] myArray = new int[]{7,4,5,8,9,6,2};
        int index = getElementIndex(myArray,5);
        System.out.println(
                index!=-1 ? "The element is found at index "+index : "The element is not found " + index
        );
    }
}
