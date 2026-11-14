public class MatrixAddition {

    public static void main(String[] args) {

        // Declare and initialize Matrix A
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Declare and initialize Matrix B
        int[][] matrixB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Create result array
        int[][] result = new int[3][3];

        // Add corresponding elements
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                result[row][col] = matrixA[row][col]
                        + matrixB[row][col];
            }
        }

        // Display Matrix A
        System.out.println("Matrix A:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrixA[row][col] + "\t");
            }
            System.out.println();
        }

        // Display Matrix B
        System.out.println("\nMatrix B:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrixB[row][col] + "\t");
            }
            System.out.println();
        }

        // Display result
        System.out.println("\nResult:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(result[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
