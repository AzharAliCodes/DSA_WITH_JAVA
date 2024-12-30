package dsa_with_java.DAY3;
import java.util.*;

public class Q04sorting {
// Changed the class name to match the question numbe
    public static void main(String args[]) {
        int n, i; // Declaring variables
        int arr[]; // Declaring an array

        // Allocating space for the array
        arr = new int[20]; 
        
        // Creating a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the number of elements in the array
        System.out.print("How many values do you want in your array? ");
        n = sc.nextInt();

        // Prompt user to enter values into the array
        System.out.println("Enter " + n + " values into the array:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display array before sorting
        System.out.println("Before sorting, the array is:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Bubble Sort implementation
        for (i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) { // j should start at i+1
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display array after sorting
        System.out.println("After sorting, the array is:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
