import java.util.Random;
import java.util.Scanner;

public class q8_Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB = scanner.nextInt();

        // Create random matrices
        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Addition (only if dimensions match)
        if (rowsA == rowsB && colsA == colsB) {
            int[][] addition = addMatrices(matrixA, matrixB);
            System.out.println("\nMatrix A + Matrix B:");
            displayMatrix(addition);
        } else {
            System.out.println("\nAddition not possible: Matrix dimensions must be the same.");
        }

        // Subtraction (only if dimensions match)
        if (rowsA == rowsB && colsA == colsB) {
            int[][] subtraction = subtractMatrices(matrixA, matrixB);
            System.out.println("\nMatrix A - Matrix B:");
            displayMatrix(subtraction);
        } else {
            System.out.println("\nSubtraction not possible: Matrix dimensions must be the same.");
        }

        // Multiplication (only if colsA == rowsB)
        if (colsA == rowsB) {
            int[][] multiplication = multiplyMatrices(matrixA, matrixB);
            System.out.println("\nMatrix A * Matrix B:");
            displayMatrix(multiplication);
        } else {
            System.out.println("\nMultiplication not possible: Number of columns of A must equal number of rows of B.");
        }
    }

    // Create a random matrix of specified size with values 0-9
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);  // values from 0 to 9
            }
        }
        return matrix;
    }

    // Add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Subtract matrixB from matrixA
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // Multiply matrices matrixA and matrixB
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    // Display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}