// This program generates and displays all possible subarrays of a given array in nested format.
// A subarray is defined as a contiguous sequence of elements within the array.

public class Q17_SubArray {
    public static void main(String[] args) {
        int k, arr[] = {2, 4, 6, 8, 10};

        for (int i = 0; i < arr.length; i++) { // Outer loop selects the starting element of each subarray
            System.out.print("(" + arr[i] + ")  "); // Prints single-element subarray
            
            for (int j = i + 1; j < arr.length; j++) { // Inner loop selects the ending element of the subarray
                System.out.print("(" + arr[i] + ","); // Starts the subarray with the first element
                
                k = j;
                int l = i + 1;

                while (l != j + 1) { // Loop prints elements between the start and end of the subarray
                    if (l != k)
                        System.out.print(arr[l] + ",");
                    else
                        System.out.print(arr[l]); // Avoids trailing comma for the last element
                    l++;
                }
                System.out.print(")  "); // Closes the subarray
            }
            System.out.println(); // Moves to the next line after processing subarrays for one element
        }
    }
}
