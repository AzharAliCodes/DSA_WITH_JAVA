// This program demonstrates how to print a 2D matrix in a spiral order.
// The program defines a static matrix and prints its elements in a spiral sequence.
// Spiral order traverses the matrix layer by layer, starting from the outermost layer and moving inward.

package dsa_with_java;

public class Q04_SpiralMatrix {
    public static void main(String[] args) {
        int m[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}; // Input 2D array
        int r = m.length, c = m[0].length; // Determine number of rows and columns
        spiralPrint(m, r, c); // Call function to print matrix in spiral order
    }

    public static void spiralPrint(int[][] m, int r, int c) {
        int sr = 0, er = r - 1, sc = 0, ec = c - 1; // Define boundaries for traversal

        System.out.println("Normal array matrix:");
        for (int i = 0; i < r; i++) { // Print the original matrix
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("After Spiral matrix:");
        while (sr <= er && sc <= ec) { // Traverse the matrix in a spiral order
            // TOP: Traverse from left to right along the top boundary
            for (int i = sc; i <= ec; i++) {
                System.out.print(m[sr][i] + "  ");
            }
            // RIGHT: Traverse from top to bottom along the right boundary
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(m[i][ec] + "  ");
            }
            // BOTTOM: Traverse from right to left along the bottom boundary
            for (int i = ec - 1; i >= sc && sr < er; i--) {
                if (sr==er)
                   break;
                System.out.print(m[er][i] + "  ");
            }
            // LEFT: Traverse from bottom to top along the left boundary
            for (int i = er - 1; i > sr && sc < ec; i--) {
                if(sc==ec)
                   break;
                System.out.print(m[i][sc] + "  ");
            }

            sr++; // Move the top boundary inward
            er--; // Move the bottom boundary inward
            sc++; // Move the left boundary inward
            ec--; // Move the right boundary inward
        }
    }
}
