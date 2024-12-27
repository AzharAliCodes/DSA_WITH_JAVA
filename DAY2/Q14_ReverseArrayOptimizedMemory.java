// This program reverses an array in place without using extra memory.
// It swaps elements at the start and end of the array while moving inward.
// The program prints the original array and the reversed array as output.

public class Q14_ReverseArrayOptimizedMemory {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6};

        // Printing the original array
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) { // Loop to print all elements of the array
            System.out.print(arr[i] + " ");
        }

        // Reversing the array in place
        int f = 0, l = arr.length - 1;
        while (f < l) { // Loop to swap elements from start and end, moving towards the middle
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }

        // Printing the reversed array
        System.out.println("\nReversed Array:");
        for (int i = 0; i < arr.length; i++) { // Loop to print the reversed array
            System.out.print(arr[i] + " ");
        }
    }
}
