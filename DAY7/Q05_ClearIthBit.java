// This program clears the i-th bit of a given number `n` by setting it to 0.
// The `ClearIthBit` function uses a bitmask and the bitwise AND operator to achieve this.

package dsa_with_java.DAY7;

public class Q05_ClearIthBit {
    public static void main(String[] args) {
        // Example usage: Clear the 1st bit of the number 10 (1010 in binary).
        System.out.println(ClearIthBit(10, 1)); // Expected output: 8 (1000 in binary)
    }

    // Function to clear the i-th bit of the number `n` (set it to 0)
    public static int ClearIthBit(int n, int i) {
        int bitmask = ~(1 << i); // Create a bitmask by shifting 1 to the i-th position and negating it
        return n & bitmask; // Use the AND operator to clear the i-th bit
    }
}
