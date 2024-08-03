import java.util.*;

public class MatrixAddition {

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[matrixA.length][matrixA[0].length];
        for (int i=0; i<=matrixA.length-1;i++) {
            for (int j=0; j<=matrixA[i].length-1; j++) {
                int sum = matrixA[i][j] + matrixB[i][j];
                result[i][j] = sum;
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {

        for(int i = 0;i<=matrix.length-1;i++) {
            for (int j = 0 ;j<=matrix[i].length-1;j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        System.out.println();

        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];

        System.out.println("Input values for Matrix A....");
            for (int i = 0; i<rows;i++) {
                for (int j = 0 ; j < columns;j++) {
                    System.out.print("Input value at"+(i+1)+"x"+(j+1)+": ");
                    int element = sc.nextInt();
                    matrixA[i][j] = element;
                }
            }

        System.out.println("Input values for Matrix B....");

        for (int i = 0; i<rows;i++) {
            for (int j = 0 ; j < columns;j++) {
                System.out.print("Input value at"+(i+1)+"x"+(j+1)+": ");
                int element = sc.nextInt();
                matrixB[i][j] = element;
            }
        }

        System.out.println("\nMatrix A: ");
        printMatrix(matrixA);
        System.out.println("\nMatrix B: ");
        printMatrix(matrixB);
        System.out.println();


        int[][] result = addMatrices(matrixA, matrixB);

        System.out.println("Resulting Matrix:");

        printMatrix(result);

    }

}