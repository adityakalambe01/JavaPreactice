package array.w3resources;

public class Q3GridPattern {
    public static void main(String[] args) {
        int[][] gridArray = new int[10][10];

        for (int i = 0; i < gridArray.length; i++) {
            for (int j = 0; j < gridArray[i].length; j++) {
                System.out.printf("%-2s","-");
            }
            System.out.println();
        }
    }
}
