// This program demonstrates an optimized approach to search for an element in a 2D sorted matrix.
// The matrix is row-wise and column-wise sorted.
// It uses a single loop to search the element by starting from the top-right corner of the matrix.
// If the element is found, its position is printed; otherwise, a message is displayed indicating it is not found.

package dsa_with_java.DAY5;

public class Q07_SearchInSortedMatrix {
    public static void searchInSortedMatrix(int m[][], int key) {
        int row = 0, col = m[0].length - 1; // Start from the top-right corner
        
        while (row < m.length && col >= 0) { // Ensure we stay within bounds
            if (m[row][col] == key) {
                System.out.println("Found key at m[" + row + "][" + col + "]");
                return; // Exit after finding the key
            } else if (key < m[row][col]) {
                col--; // Move left if the key is smaller
            } else {
                row++; // Move down if the key is larger
            }
        }
        
        // If we exit the loop without finding the key
        System.out.println("Search element " + key + " not found");
    }

    public static void main(String[] args) {
        int m[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        }; // Example sorted matrix
        int key = 33;
        searchInSortedMatrix(m, key);
    }
}
