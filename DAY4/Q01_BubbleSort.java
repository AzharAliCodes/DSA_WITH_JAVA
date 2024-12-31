// This program demonstrates the Bubble Sort algorithm in Java. 
// It sorts an array of integers in both ascending and descending order
// by repeatedly comparing and swapping adjacent elements that are out of order.

package dsa_with_java.DAY4;

public class Q01_BubbleSort {
    public static void main(String[] args) {
        // Initial array to be sorted
        int arr[] = {2, 3, 4, 1, 5}; 
        int n = arr.length;

        // Sorting in Ascending Order
        // Outer loop determines the number of passes (n-1 passes in total)
        for (int i = 0; i < n - 1; i++) {
            // Inner loop performs comparisons and swaps adjacent elements if needed
            for (int j = 0; j < n - i - 1; j++) {
                // Compare the current element with the next element
                if (arr[j] > arr[j + 1]) { 
                    // Swap elements to ensure the smaller element comes first
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Print the sorted array in ascending order
        System.out.println("Ascending order:");
        for (int i : arr) { // Enhanced for loop to print the elements
            System.out.println(i);
        }

        // Sorting in Descending Order
        // Outer loop determines the number of passes (n-1 passes in total)
        for (int i = 0; i < n - 1; i++) {
            // Inner loop performs comparisons and swaps adjacent elements if needed
            for (int j = 0; j < n - i - 1; j++) {
                // Compare the current element with the next element
                if (arr[j] < arr[j + 1]) {
                    // Swap elements to ensure the larger element comes first
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Print the sorted array in descending order
        System.out.println("Descending order:");
        for (int i : arr) { // Enhanced for loop to print the elements
            System.out.println(i);
        }
    }
}
