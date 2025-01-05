// This program demonstrates the usage of a 2D array in Java. 
// It allows the user to input elements into a 3x3 matrix and then displays the matrix.
// The program uses nested loops to both take input and print the elements of the array.

package dsa_with_java.DAY5;
import java.util.*;

public class Q01_Demonstrate2DArray {
    public static void main(String[] args) {
        // Creating a 2D array of size 3x3
        int arr[][] = new int[3][3];

        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Finding the length of the 2D array rows and columns
        int n = arr.length; // Rows in the 2D array
        int m = arr[0].length; // Columns in the 2D array

        // Loop to take input from the user for each element in the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Asking the user to input an element for each position in the array
                System.out.println("Enter element at position [" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt(); // Storing the input element at the respective position
            }
        }

        // Loop to print the 2D array in matrix form
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Printing each element in the array with space for better readability
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(); // Print a new line after each row
        }
    }
}
 