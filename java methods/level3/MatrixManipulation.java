import java.util.Scanner;

public class MatrixManipulation {

    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); 
            }
        }
        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static double determinant2x2(double[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    public static double determinant3x3(double[][] matrix) {
        double det = matrix[0][0] * (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])
                   - matrix[0][1] * (matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])
                   + matrix[0][2] * (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
        return det;
    }

    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) throw new IllegalArgumentException("Matrix has no inverse (det=0)");

        double[][] inv = new double[2][2];
        inv[0][0] = matrix[1][1] / det;
        inv[0][1] = -matrix[0][1] / det;
        inv[1][0] = -matrix[1][0] / det;
        inv[1][1] = matrix[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) throw new IllegalArgumentException("Matrix has no inverse (det=0)");

        double[][] inv = new double[3][3];

        inv[0][0] = (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]) / det;
        inv[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]) / det;
        inv[0][2] = (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]) / det;

        inv[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]) / det;
        inv[1][1] = (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]) / det;
        inv[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0]) / det;

        inv[2][0] = (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]) / det;
        inv[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]) / det;
        inv[2][2] = (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]) / det;

        return inv;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of matrix (2 or 3): ");
        int n = sc.nextInt();

        double[][] matrix = createRandomMatrix(n, n);

        System.out.println("\nMatrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix));

        switch (n) {
            case 2 ->                 {
                    double det = determinant2x2(matrix);
                    System.out.println("\nDeterminant (2x2): " + det);
                    if (det != 0) {
                        System.out.println("\nInverse (2x2):");
                        printMatrix(inverse2x2(matrix));
                    } else {
                        System.out.println("\nMatrix has no inverse (det=0)");
                    }                      }
            case 3 ->                 {
                    double det = determinant3x3(matrix);
                    System.out.println("\nDeterminant (3x3): " + det);
                    if (det != 0) {
                        System.out.println("\nInverse (3x3):");
                        printMatrix(inverse3x3(matrix));
                    } else {
                        System.out.println("\nMatrix has no inverse (det=0)");
                    }                      }
            default -> System.out.println("Only 2x2 or 3x3 matrices are supported.");
        }

        sc.close();
    }
}

