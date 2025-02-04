package dsa_with_java.DAY7;

public class Q08_ClearRangOfBits {
    public static void main(String[] args) {
        System.out.println(rangebit(10, 2, 4)); // Example: Clearing bits from position 2 to 4 in 10 (1010)
    }

    /**
     * Function to clear all bits from position i to position j in a number n.
     * The bitmask is created by first clearing the bits from 0 to j, 
     * then clearing the bits from i to 0, and combining them using OR.
     */
    public static int rangebit(int n, int i, int j) {
        // Step 1: Create a mask to clear bits from position j to 0
        int a = ((~0) << (j + 1)); // This shifts all 1s to the left of position j
        // Step 2: Create a mask to clear bits from position 0 to i-1
        int b = (1 << i) - 1; // This sets all bits before position i to 1 and after to 0
        // Step 3: Combine the two masks
        int bitMask = a | b; // This gives a final mask with 1s everywhere except positions i to j
        return n & bitMask; // Apply the mask using bitwise AND to clear the bits
    }
}
