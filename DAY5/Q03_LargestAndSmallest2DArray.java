// This program demonstrates how to find the largest and smallest elements in a 2D array in Java.
// It allows the user to input the dimensions and elements of the array and then determines 
// and displays the largest and smallest elements in the array.

package dsa_with_java;

import java.util.Scanner;

public class Q03_LargestAndSmallest2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;

        // Prompt the user for the size of the array
        System.out.print("How many elements do you want in your array?\nEnter the size of rows: ");
        m = sc.nextInt();
        System.out.print("Enter the size of columns: ");
        n = sc.nextInt();

        // Initialize the 2D array
        int arr[][] = new int[m][n];

        // Populate the array with user input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Find and display the largest element
        Largest_Element(arr, m, n);

        // Find and display the smallest element
        Smallest_Element(arr, m, n);
    }

    // Function to find the largest element in the 2D array
    public static void Largest_Element(int arr[][], int rows, int cols) {
        int largest = Integer.MIN_VALUE; // Initialize with the smallest possible integer
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest Element is: " + largest);
    }

    // Function to find the smallest element in the 2D array
    public static void Smallest_Element(int arr[][], int rows, int cols) {
        int smallest = Integer.MAX_VALUE; // Initialize with the largest possible integer
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("Smallest Element is: " + smallest);
    }
}
