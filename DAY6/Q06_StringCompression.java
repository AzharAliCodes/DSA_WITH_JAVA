/**
 * This program compresses a given string by replacing consecutive repeated characters
 * with the character followed by the count of its occurrences.
 * 
 * Example: Input "aaabbcccdd" -> Output "a3b2c3d2"
 */
public class Q06_StringCompression {
    public static void main(String[] args) {
        String str = "aaabbcccdd"; // Input string
        System.out.println(compressString(str)); // Call the method and print the compressed string
    }
    
    public static String compressString(String str) {
        StringBuffer sb = new StringBuffer(); // To build the compressed string
        int len = str.length(); // Length of the input string

        // Iterate through each character of the string
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i); // Current character
            sb.append(ch); // Append the character to the result
            int c = 1; // Counter to track occurrences of the character

            // Check for consecutive identical characters
            while (i < len - 1 && ch == str.charAt(i + 1)) {
                c++; // Increment counter
                i++; // Move to the next character
            }

            // Append the count if it's greater than 1
            if (c > 1) {
                sb.append(c);
            }
        }

        return sb.toString(); // Return the compressed string
    }
}
