package arrays;

public class Spiral_Matrix_Question {
    public static void printSpiral(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return; // Empty matrix
        }

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Print top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // Print right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Print bottom row
            if (startRow <= endRow) { // Check to prevent duplicate printing
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // Print left column
            if (startCol <= endCol) { // Check to prevent duplicate printing
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        printSpiral(matrix);
    }
}
