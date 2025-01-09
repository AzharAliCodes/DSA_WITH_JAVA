/**
 * This program capitalizes the first letter of each word in a given string.
 * Words are assumed to be separated by spaces.
 */
public class Q05_GivenFirstLetterOfStringToUpper {
    public static void main(String[] args) {
        String str = "hi, i am azharuddin ali"; // Input string
        System.out.println(toUpperCase(str)); // Print the result after transformation
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(""); // To store the transformed string
        char ch = Character.toUpperCase(str.charAt(0)); // Convert the first character to uppercase
        sb.append(ch); // Append the uppercase first character to the result

        // Iterate through the rest of the string
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) { 
                // If a space is encountered and it's not the last character
                sb.append(str.charAt(i)); // Append the space
                i++; // Move to the next character
                sb.append(Character.toUpperCase(str.charAt(i))); // Append the uppercase character
            } else {
                sb.append(str.charAt(i)); // Append other characters as is
            }
        }

        return sb.toString(); // Return the final transformed string
    }
}
