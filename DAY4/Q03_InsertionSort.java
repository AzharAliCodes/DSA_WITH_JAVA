// This program demonstrates the Insertion Sort algorithm in Java.
// It sorts an array of integers in both ascending and descending orders.

package dsa_with_java.DAY4;

public class Q03_InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 5}; // Initial array to be sorted
        int n = arr.length, key;

        // Sorting in Ascending Order
        for (int i = 1; i < n; i++) {
            key = arr[i]; // Current element to be inserted into the sorted part
            int j = i - 1;
            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Place the key in its correct position
        }
        // Print the sorted array in ascending order
        System.out.println("Ascending Order:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Sorting in Descending Order
        for (int i = 1; i < n; i++) {
            key = arr[i]; // Current element to be inserted into the sorted part
            int j = i - 1;
            // Shift elements smaller than key to one position ahead
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Place the key in its correct position
        }
        // Print the sorted array in descending order
        System.out.println("Descending Order:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
