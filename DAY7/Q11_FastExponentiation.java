package dsa_with_java.DAY7;

public class Q11_FastExponentiation {
    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3)); // Expected Output: 125 (5^3 = 5 * 5 * 5)
    }

    /**
     * Function to calculate a^n (a raised to power n) using Fast Exponentiation.
     * This method reduces time complexity to O(log n) instead of O(n).
     */
    public static int fastExpo(int a, int n) {
        int ans = 1;
        
        // Loop until the power (n) becomes 0
        while (n > 0) {
            if ((n & 1) != 0) { // Check if the least significant bit (LSB) of n is 1
                ans = ans * a; // If LSB is 1, multiply ans by current a
            }
            a = a * a; // Square the base (a = a^2)
            n = n >> 1; // Right shift n (divide n by 2)
        }
        return ans; // Return final result
    }
}
