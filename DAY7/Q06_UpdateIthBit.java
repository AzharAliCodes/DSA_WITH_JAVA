package dsa_with_java.DAY7;

public class Q06_UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(updatebit(10, 2, 1)); // Example: Updating the 2nd bit of 10 (1010) to 1
    } 

    /**
     * Function to clear the i-th bit of the number `n` (set it to 0).
     * This is done by creating a bitmask with all 1s except at the i-th position,
     * then performing a bitwise AND operation with `n` to clear that bit.
     */
    public static int ClearIthBit(int n, int i) {
        int bitmask = ~(1 << i); // Create a bitmask by shifting 1 to the i-th position and negating it
        return n & bitmask; // Use the AND operator to clear the i-th bit
    }

    /**
     * Function to update the i-th bit of `n` with `newBit` (0 or 1).
     * First, it clears the i-th bit, then sets it to the desired value.
     */
    public static int updatebit(int n, int i, int newBit) {
        n = ClearIthBit(n, i); // Clear the i-th bit
        int BitMask = newBit << i; // Shift newBit to the correct position
        return n | BitMask; // Use OR operation to set the new bit
    }
}
