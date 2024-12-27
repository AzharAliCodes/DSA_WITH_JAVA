// This program calculates and displays all unique pairs of elements from an array.
// It also computes the total number of pairs and the sum of all the pairs.

public class Q16_TotalOfArrayPairs {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int total = 0, t = 0;

        for (int i = 0; i < arr.length; i++) { // Outer loop selects the first element of the pair
            for (int j = i + 1; j < arr.length; j++) { // Inner loop selects the second element of the pair
                total = total + arr[i] + arr[j]; // Adds the sum of the current pair to the total
                t++; // Increments the pair count
                System.out.print("(" + arr[i] + "," + arr[j] + ")"); // Displays the current pair
            }
            System.out.println(); // Moves to the next line after processing all pairs for one element
        }

        System.out.println("Total pairs = " + t); // Displays the total number of pairs
        System.out.println("Total of array pairs is = " + total); // Displays the sum of all pairs
    }
}
