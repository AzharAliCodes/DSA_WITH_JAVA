// This program calculates and displays all possible subarrays of an array, along with their sums.
// It also finds and prints the maximum subarray sum.

public class Q18_MaxSubArray {
    public static void main(String[] args) {
        int total = 0, max = 0, k, arr[] = {1, -2, 6, -1, 3};

        for (int i = 0; i < arr.length; i++) { // Outer loop selects the starting element of each subarray
            total = arr[i]; // Initialize the sum for the current subarray
            if (arr[i] > max) { 
                max = arr[i]; // Update max if the current element is greater
            }
            System.out.print("(" + arr[i] + ")=" + total + "  "); // Single-element subarray and its sum

            for (int j = i + 1; j < arr.length; j++) { // Inner loop selects the ending element of the subarray
                System.out.print("(" + arr[i] + ","); // Starts printing the subarray
                k = j;
                int l = i + 1;

                while (l != j + 1) { // Iterates through elements of the subarray
                    if (l != k) {
                        System.out.print(arr[l] + ",");
                        total += arr[l]; // Adds current element to the total
                    } else {
                        System.out.print(arr[l]);
                        total += arr[l]; // Adds the last element of the subarray
                    }
                    l++;
                }
                System.out.print(")=" + total + "  "); // Closes subarray and displays its sum

                if (total > max) {
                    max = total; // Updates max if the current subarray sum is greater
                }
                total = arr[i]; // Resets total for the next subarray
            }
            System.out.println(); // Moves to the next line after processing subarrays for one element
            total = 0; // Resets total for the next starting element
        }

        System.out.println("The max subarray sum is = " + max); // Displays the maximum subarray sum
    }
}
