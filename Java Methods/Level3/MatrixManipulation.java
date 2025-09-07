import java.util.Random;
import java.util.Scanner;

public class MatrixManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size (only 2 or 3 supported)
        System.out.print("Enter matrix size (2 or 3): ");
        int size = scanner.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
            return;
        }

        int[][] matrix = createRandomMatrix(size, size);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Transpose
        int[][] transpose = findTranspose(matrix);
        System.out.println("\nTranspose:");
        displayMatrix(transpose);

        // Determinant
        double determinant;
        if (size == 2) {
            determinant = determinant2x2(matrix);
        } else {
            determinant = determinant3x3(matrix);
        }
        System.out.printf("\nDeterminant: %.2f\n", determinant);

        if (determinant == 0) {
            System.out.println("Matrix is singular; inverse does not exist.");
            return;
        }

        // Inverse
        double[][] inverse;
        if (size == 2) {
            inverse = inverse2x2(matrix);
        } else {
            inverse = inverse3x3(matrix);
        }
        System.out.println("\nInverse:");
        displayMatrix(inverse);
    }

    // Create random matrix with integers 0-9
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    // Find transpose of matrix
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(int[][] matrix) {
        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];

        return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        double[][] inverse = new double[2][2];

        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;

        return inverse;
    }

    // Inverse of 3x3 matrix using adjoint and determinant
    public static double[][] inverse3x3(int[][] matrix) {
        double det = determinant3x3(matrix);
        double[][] adj = new double[3][3];

        adj[0][0] =  det2x2(matrix[1][1], matrix[1][2], matrix[2][1], matrix[2][2]);
        adj[0][1] = -det2x2(matrix[0][1], matrix[0][2], matrix[2][1], matrix[2][2]);
        adj[0][2] =  det2x2(matrix[0][1], matrix[0][2], matrix[1][1], matrix[1][2]);

        adj[1][0] = -det2x2(matrix[1][0], matrix[1][2], matrix[2][0], matrix[2][2]);
        adj[1][1] =  det2x2(matrix[0][0], matrix[0][2], matrix[2][0], matrix[2][2]);
        adj[1][2] = -det2x2(matrix[0][0], matrix[0][2], matrix[1][0], matrix[1][2]);

        adj[2][0] =  det2x2(matrix[1][0], matrix[1][1], matrix[2][0], matrix[2][1]);
        adj[2][1] = -det2x2(matrix[0][0], matrix[0][1], matrix[2][0], matrix[2][1]);
        adj[2][2] =  det2x2(matrix[0][0], matrix[0][1], matrix[1][0], matrix[1][1]);

        // Transpose of cofactor matrix = adjoint
        adj = findTranspose(adj);

        // Divide adjoint by determinant
        double[][] inverse = new double[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                inverse[r][c] = adj[r][c] / det;
            }
        }

        return inverse;
    }

    // Helper: determinant of 2x2 given elements
    private static double det2x2(int a, int b, int c, int d) {
        return a*d - b*c;
    }

    // Overloaded transpose for double matrix
    private static double[][] findTranspose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Display integer matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row: matrix) {
            for (int val: row) {
                System.out.printf("%6d ", val);
            }
            System.out.println();
        }
    }

    // Display double matrix
    private static void displayMatrix(double[][] matrix) {
        for (double[] row: matrix) {
            for (double val: row) {
                System.out.printf("%8.3f ", val);
            }
            System.out.println();
        }
    }

}