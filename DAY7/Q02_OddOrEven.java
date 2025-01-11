// This program determines if a number is odd or even using bitwise operations and prints the result.
// The `oddoreven` function performs the check by using a bitmask and the bitwise AND operator.

package dsa_with_java.DAY7;

public class Q02_OddOrEven {

    // Function to check if a number is odd or even
    public static void oddoreven(int n) {
        int bitmask = 1; // Bitmask with the least significant bit set to 1

        // Using bitwise AND to check the least significant bit
        if ((n & bitmask) == 0) { 
            // If the result is 0, the number is even
            System.out.println("Even number");
        } else {
            // Otherwise, the number is odd
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        // Test cases
        oddoreven(3); // Output: "Odd number"
        oddoreven(4); // Output: "Even number"
    }
}
