// This program sets the i-th bit of a given number `n` to 1.
// The `getIthBit` function uses a bitmask and the bitwise OR operator to ensure the i-th bit is set.

package dsa_with_java.DAY7;

public class Q04_SetIthBit {

    public static void main(String[] args) {
        // Example usage: Set the 2nd bit of the number 10 (1010 in binary).
        System.out.println(getIthBit(10, 2)); // Expected output: 14 (1110 in binary)
    }

    // Function to set the i-th bit of the number `n` to 1
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i; // Create a bitmask by shifting 1 to the i-th position
        return n | bitmask; // Use the OR operator to set the i-th bit to 1
    }
}
