// This program reverses an array using an additional array. 
// It first prints the original array, then copies its elements in reverse order 
// into a new array, and finally replaces the original array with the reversed values. 
// Two loops are used: one for reversing the elements and another for copying them back.

public class Q13_ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // Original array
        int a[]; // Array to store reversed elements
        a = new int[arr.length];

        // Display the original array
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Loop to reverse elements into a new array
        for (int i = 0; i < arr.length; i++) {
            int j = (arr.length - 1 - i); // Calculate the index for reverse order
            a[i] = arr[j];
        }

        // Loop to copy reversed elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a[i];
        }

        // Display the reversed array
        System.out.println("\nReversed Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
