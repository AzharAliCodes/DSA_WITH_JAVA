package dsa_with_java.DAY7;

public class Q09CheckPowerOf2OrNot {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15)); // Checking if 15 is a power of 2
    }

    /**
     * Function to check if a given number is a power of 2.
     * A number is a power of 2 if it has exactly one bit set in its binary representation.
     */
    public static boolean isPowerOfTwo(int n) {
        // A power of 2 has only one bit set, so n & (n - 1) should be 0.
        return (n & (n - 1)) == 0;
    }
}
