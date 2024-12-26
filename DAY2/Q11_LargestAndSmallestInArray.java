// This program finds the largest and smallest numbers in a predefined integer array.
// It uses two methods: one to find the largest number and one to find the smallest number.
// The array is predefined as {2, 9, 7, 4, 8, 1}.

import java.util.*;

class Q11_LargestAndSmallestInArray {
    public static void main(String args[]) {
        // Predefined array
        int arr[] = {2, 9, 7, 4, 8, 1};
        
        // Calling the methods to find the largest and smallest numbers in the array
        System.out.println("Largest number in array: " + getLargest(arr));
        System.out.println("Smallest number in array: " + getSmallest(arr));
    }

    // Method to find the largest number in the array
    public static int getLargest(int arr[]) {
        // Initialize largest to the smallest possible value
        int largest = Integer.MIN_VALUE;
        
        // Loop through the array and compare each element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if a larger number is found
            }
        }
        return largest; // Return the largest number
    }

    // Method to find the smallest number in the array
    public static int getSmallest(int arr[]) {
        // Initialize smallest to the largest possible value
        int smallest = Integer.MAX_VALUE;
        
        // Loop through the array and compare each element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest if a smaller number is found
            }
        }
        return smallest; // Return the smallest number
    }
}
