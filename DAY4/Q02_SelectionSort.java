// This program demonstrates the Selection Sort algorithm in Java.
// It sorts an array of integers in both ascending and descending order by 
// repeatedly selecting the smallest or largest element from the unsorted part of the array
// and placing it in the correct position.

package dsa_with_java.DAY4;

public class Q02_SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 5}; // Initial array to be sorted
        int n = arr.length;

        // Sorting in Ascending Order
        // Outer loop: Determines the position where the smallest element will be placed
        for (int i = 0; i < n - 1; i++) {
            int s = i; // Assume the current index is the smallest
            // Inner loop: Finds the smallest element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[s] > arr[j]) { // Compare the assumed smallest with the current element
                    s = j; // Update index of the smallest element
                }
            }
            // Swap the smallest element with the element at the current position
            int temp = arr[i];
            arr[i] = arr[s];
            arr[s] = temp;
        }
        // Print the sorted array in ascending order
        System.out.println("Ascending Order:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Sorting in Descending Order
        // Outer loop: Determines the position where the largest element will be placed
        for (int i = 0; i < n - 1; i++) {
            int s = i; // Assume the current index is the largest
            // Inner loop: Finds the largest element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[s] < arr[j]) { // Compare the assumed largest with the current element
                    s = j; // Update index of the largest element
                }
            }
            // Swap the largest element with the element at the current position
            int temp = arr[i];
            arr[i] = arr[s];
            arr[s] = temp;
        }
        // Print the sorted array in descending order
        System.out.println("Descending Order:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
