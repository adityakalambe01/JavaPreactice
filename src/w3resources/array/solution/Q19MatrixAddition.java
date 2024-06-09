package w3resources.array.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q19MatrixAddition {
    static int[][] addMatrix(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        int n = 3;
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
        }

        int[][] result = addMatrix(matrix1,matrix2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%2d ",result[i][j]);
            }
            System.out.println();
        }
    }
}
