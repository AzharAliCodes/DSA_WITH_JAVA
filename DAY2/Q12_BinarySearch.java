// This program implements the Binary Search algorithm to search for an element in a sorted array.
// If the element is found, its index (1-based) is displayed. If not, the program notifies the user.

import java.util.*;

public class Q12_BinarySearch {
    public static void main(String[] args) {
        // Predefined sorted array
        int arr[] = {1, 3, 5, 7, 9};
        boolean found = false;

        // Create a Scanner object to take input from the user
        Scanner obj = new Scanner(System.in);

        // Initialize pointers for binary search
        int f = 0; // Start index
        int l = arr.length - 1; // End index
        int m; // Middle index

        // Input the element to search
        System.out.println("Enter the element to search:");
        int s = obj.nextInt();

        // Perform binary search
        while (f <= l) {
            // Calculate the middle index
            m = (f + l) / 2;

            if (arr[m] == s) {
                // Element found
                System.out.println("Element found at index: " + (m + 1)); // 1-based index
                found = true;
                break;
            } else if (arr[m] < s) {
                // Search in the right half
                f = m + 1;
            } else {
                // Search in the left half
                l = m - 1;
            }
        }

        // If the element is not found, display an appropriate message
        if (!(found)) {
            System.out.println("The search element " + s + " does not exist in the array.");
        }
    }
}
