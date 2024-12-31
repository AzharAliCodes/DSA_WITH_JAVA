// This program demonstrates sorting an array using in-built functions in Java.
// It includes sorting parts of the array and full array in ascending and descending orders.

package dsa_with_java.DAY4;
import java.util.*;

public class Q04_SortUsingInbuiltFunction {
    public static void main(String[] args) {
        // Part 1: Sorting a portion of the array in ascending order
        int arr[] = {2, 3, 4, 1, 5};
        System.out.println("Sort some part of the array (indexes 2 to 4) in ascending order:");
        Arrays.sort(arr, 2, 4); // Sorts elements from index 2 to 3
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Part 2: Sorting the entire array in ascending order
        System.out.println("\nSort the entire array in ascending order:");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Part 3: Sorting a portion of the array in descending order
        Integer array[] = {2, 3, 4, 1, 5}; // Use Integer[] for reverseOrder()
        System.out.println("\nSort some part of the array (indexes 2 to 4) in descending order:");
        Arrays.sort(array, 2, 4, Collections.reverseOrder()); // Sorts elements from index 2 to 3 in descending order
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Part 4: Sorting the entire array in descending order
        System.out.println("\nSort the entire array in descending order:");
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
