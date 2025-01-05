// This program searches for a specific element in a 2D array (matrix).
// The matrix is row-wise and column-wise sorted.
// It uses a nested loop to traverse the matrix and checks for the presence of the target element.
// If the element is found, its position is printed; otherwise, a message indicates it is not found.

package dsa_with_java.DAY5;
import java.util.*;

public class Q06_SearchElementInMatrix {
    public static void main(String[] args) {
        int m[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        }; // Example sorted matrix

        int key;
        boolean found = false;
        System.out.print("Enter search element: ");
        Scanner obj = new Scanner(System.in);
        key = obj.nextInt();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (key == m[i][j]) {
                    System.out.println("Found " + key + " at position m[" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }

        if (!(found))
            System.out.println("Search element " + key + " not found");
    }
}
