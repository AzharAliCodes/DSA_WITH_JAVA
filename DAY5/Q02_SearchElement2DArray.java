// This program demonstrates how to search for a specific element in a 2D array in Java. 
// It takes the size of the array and its elements from the user, then prompts the user 
// to enter the element to search for. The program checks the entire array and prints 
// the position if the element is found or informs the user if it is not found.

package dsa_with_java;

import java.util.Scanner;

public class Q02_SearchElement2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        // Prompt the user to input the dimensions of the array
        System.out.print("How many elements do you want in your array?\nEnter the size of rows: ");
        m = sc.nextInt();
        System.out.print("Enter the size of columns: ");
        n = sc.nextInt();

        // Initialize the 2D array with user-defined dimensions
        int arr[][] = new int[m][n];

        // Take input for each element in the 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element at position [" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }

        // Prompt the user to input the element to search for
        System.out.println("Enter the element to search:");
        int s = sc.nextInt();

        // Call the function to search for the element
        search_element(arr, s);
    }

    // Function to search for an element in a 2D array
    public static void search_element(int arr[][], int s) {
        for (int i = 0; i < arr.length; i++) { // Iterate through rows
            for (int j = 0; j < arr[i].length; j++) { // Iterate through columns
                if (arr[i][j] == s) { // Check if the current element matches the search element
                    System.out.println("Element "+s+" found at position [" + i + "][" + j + "]");
                    return; // Exit the function once the element is found
                }
            }
        }
        // If the loop completes and the element is not found
        System.out.println("Element "+s+" not found");
    }
}
