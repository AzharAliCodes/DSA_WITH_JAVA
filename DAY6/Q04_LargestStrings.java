/** 
 * This program finds and prints the largest string from a given set of strings.
 * The "largest string" is determined lexicographically (dictionary order).
 */
public class Q04_LargestStrings {
    public static void main(String[] args) {
        // An array of strings to evaluate
        String[] str = {"apple", "banana", "cherry", "mango", "date"};
        
        int len = str.length; // Length of the array
        int ls = 0; // Index of the largest string so far, initialized to 0 (first string)

        // Loop through the array starting from the second string
        for (int i = 1; i < len; i++) {
            int c = str[i].compareTo(str[ls]); // Compare the current string with the largest so far
            if (c > 0) { // If the current string is lexicographically greater
                ls = i; // Update the index of the largest string
            }
        }

        // Print the largest string found
        System.out.println(str[ls]);
    }
}
