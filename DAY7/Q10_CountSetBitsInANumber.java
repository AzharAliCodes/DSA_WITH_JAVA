package dsa_with_java.DAY7;

public class Q10_CountSetBitsInANumber {
    public static void main(String[] args) {
        System.out.println(calculateSetBits(15)); // Expected Output: 4 (Binary: 1111)
    }

    /**
     * Function to count the number of set bits (1s) in a given integer.
     * The approach uses bitwise AND (&) to check if the least significant bit is 1.
     */
    public static int calculateSetBits(int n) {
        int count = 0;
        
        // Loop until all bits are checked (n becomes 0)
        while (n > 0) {
            if ((n & 1) != 0) { // Check if the least significant bit is 1
                count++; // If it's 1, increment count
            }
            n = n >> 1; // Right shift the number to check the next bit
        }
        return count; // Return total count of 1s
    }
}
