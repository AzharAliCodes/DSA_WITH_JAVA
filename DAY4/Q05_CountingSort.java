  /**
     * This program demonstrates the implementation of Counting Sort.
     * Counting Sort is a non-comparison-based sorting algorithm that works by counting the occurrences 
     * of each element in the array and then reconstructing the sorted array based on those counts.
     * It works efficiently for sorting integers within a limited range.
     */
package dsa_with_java.DAY4;

import java.util.*;

public class Q05_CountingSort {
    public static void main(String[] args) {
        // Input array to be sorted
        int arr[] = {1, 4, 1, 2, 3, 4, 3, 7}; 

        // Step 1: Find the maximum value in the array
        int max = Arrays.stream(arr).max().getAsInt(); // This determines the size of the counting array

        // Step 2: Initialize the counting array
        int countingsort[] = new int[max + 1]; // The size is one more than the maximum value

        // Step 3: Count the occurrences of each element in the input array
        for (int i = 0; i < arr.length; i++) {
            countingsort[arr[i]]++; // Increment the count for the value at arr[i]
        }

        // Step 4: Reconstruct the sorted array using the counting array
        int j = 0; // Pointer for the original array
        for (int i = 0; i < countingsort.length; i++) {
            while (countingsort[i] > 0) { // If the count of the current value is greater than 0
                arr[j] = i; // Place the value in the original array
                j++; // Move to the next position in the array
                countingsort[i]--; // Decrement the count for the current value
            }
        }

        // Step 5: Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Output the sorted array elements
        }
    }
}
