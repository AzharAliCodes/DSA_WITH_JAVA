package dsa_with_java.DAY7;

public class Q01_BitwiseOperators {
    public static void main(String[] args) {
        // Perform bitwise AND on 5 (101) and 6 (110)
        System.out.println(5 & 6); // Output: 4 (100)

        // Perform bitwise OR on 5 (101) and 6 (110)
        System.out.println(5 | 6); // Output: 7 (111)

        // Perform bitwise XOR on 5 (101) and 6 (110)
        System.out.println(5 ^ 6); // Output: 3 (011)

        // Perform bitwise NOT on 5 (101)
        System.out.println(~5); // Output: -6 (Inverts all bits and changes the sign)

        // Perform left shift on 5 (101), shifting 2 bits to the left
        System.out.println(5 << 2); // Output: 20 (10100)

        // Perform right shift on 6 (110), shifting 1 bit to the right
        System.out.println(6 >> 1); // Output: 3 (011)
    }
}
