package week5;

/*
5.17.1 Transpose matrix*
easy
|
30 min
|
Share
Description: Write a method called transposeMatrix() that takes a
2D array of integers as input. The method should transpose the matrix,
i.e. swap the rows and columns, and return the transposed matrix. Params:
A 2D array of integers. Return: A 2D array of integers representing the transposed
matrix. Example: int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; transposeMatrix(matrix);
// Returns {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}} Explanation: The input matrix has 3 rows and 3 columns.
The transpose of the matrix swaps the rows and columns, resulting in a new matrix with 3 columns and 3 rows.
Note: If the input matrix is empty or not square (i.e. has different number of rows and columns),
return an empty 2D array.
 */
//write your static method here. No need to add Main class or main method.

public class Week5_17_1_TransposeMatrix {
    public static void main(String[] args) {

    }

    public static int[][] transposeMatrix(int[][] matrix) {

        // If the matrix is empty
        if (matrix.length == 0) {
            return new int[0][0];
        }

        // If the matrix is not square
        if (matrix.length != matrix[0].length) {
            return new int[0][0];
        }

        int[][] transposed = new int[matrix.length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                transposed[column][row] = matrix[row][column];
            }
        }

        return transposed;
    }
}
