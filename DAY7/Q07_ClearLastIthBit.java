package dsa_with_java.DAY7;

public class Q07_ClearLastIthBit {
    public static void main(String[] args) {
        System.out.println(clearBit(15, 2)); // Example: Clearing all bits from position 2 to the right in 15 (1111)
    }

    /**
     * Function to clear all bits from the last i-th bit (i.e., set all bits from i-1 to 0).
     * It creates a bitmask with all 1s except for the last i bits, then performs a bitwise AND operation.
     */
    public static int clearBit(int n, int i) {
        int BitMask = (~0) << i; // Shift all bits left by `i` positions to create a mask
        return n & BitMask; // Use bitwise AND to clear the last i bits
    }
}
