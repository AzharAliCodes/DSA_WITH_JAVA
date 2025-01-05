// This program calculates the diagonal sum of a 2D square matrix.
// It includes both the primary diagonal (top-left to bottom-right) and secondary diagonal (top-right to bottom-left).
// If an element is shared by both diagonals (e.g., the center of an odd-dimension matrix), it is only counted once.

package dsa_with_java.DAY5;

public class Q05_DiagonalSum {
    public static void main(String[] args) {
        // int m[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int m[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Example square matrix
        int r = m.length, c = m[0].length; // Matrix dimensions
        calculateDiagonalSum(m, r, c); // Call the function to compute the diagonal sum
    }

    public static void calculateDiagonalSum(int[][] m, int r, int c) {
        int sum = 0, i = 0, j = c - 1; // Initialize sum and indices

        // Calculate sum of the primary diagonal
        while (i < c) {
            sum += m[i][i]; // Add the element at (i, i)
            i++;
        }

        // Calculate sum of the secondary diagonal
        for (i = 0; i < r; i++) {
            if (i != j) { // Avoid double-counting the center element in odd-dimension matrices
                sum += m[i][j]; // Add the element at (i, j)
            }
            j--; // Move to the next column in the secondary diagonal
        }

        System.out.println("Diagonal sum = " + sum); // Output the result
    }
}
