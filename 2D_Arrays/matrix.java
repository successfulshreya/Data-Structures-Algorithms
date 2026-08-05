
import java.util.Scanner;

public class matrix {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of rows and columns for the matrix:"); 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int row = 4;
        int col = 4;
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        // Print the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Minimum value in the matrix: " + min);
        System.out.println("Maximum value in the matrix: " + max);
    }
}
