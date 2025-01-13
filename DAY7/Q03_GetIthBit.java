// This program retrieves the value of the i-th bit in the binary representation of a number `n`.
// The `getIthBit` function uses a bitmask and the bitwise AND operator to extract the i-th bit.

package dsa_with_java.DAY7;

public class Q03_GetIthBit {

    public static void main(String[] args) {
        // Example usage: Find the 2nd bit of the binary representation of 10 (1010 in binary)
        System.out.println(getIthBit(10, 2)); // Expected output: 1
    }

    // Function to get the value of the i-th bit of the number `n`
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i; // Create a bitmask by shifting 1 to the i-th position

        // Check if the i-th bit is set (1) or not (0) using bitwise AND
        if ((n & bitmask) == 0) 
            return 0; // If the result is 0, the i-th bit is 0
        else 
            return 1; // Otherwise, the i-th bit is 1
    }
}
