// This program prints all unique pairs of elements from an array.
// It uses nested loops to form and display each pair.

public class Q15_ArrayPairs {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        for (int i = 0; i < arr.length; i++) { // Outer loop selects the first element of the pair
            for (int j = i + 1; j < arr.length; j++) { // Inner loop selects the second element of the pair
                System.out.print("(" + arr[i] + "," + arr[j] + ")"); // Prints each pair
            }
            System.out.println(); // Moves to the next line after each outer loop iteration
        }
    }
}
