/**
 * This program checks if a given string is a palindrome.
 * A palindrome is a word, phrase, or sequence that reads the same backward as forward.
 * Examples of palindromes: "madam", "racecar", "level".
 * 
 * The program takes a string input from the user and uses a two-pointer approach 
 * to compare characters from both ends of the string. If all characters match, 
 * the string is identified as a palindrome; otherwise, it is not.
 */

 import java.util.*; 

 class Q02_PalindromeString {
     public static void main(String[] args) {
         String s1; // Variable to store the user input string
         boolean p = true; // Flag to track if the string is a palindrome
 
         Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
         System.out.print("Enter a string:"); // Prompting the user to enter a string
         s1 = sc.nextLine(); // Reading the user input
 
         int i = 0, j = s1.length(); // `i` starts from the beginning, `j` from the end of the string
 
         // Loop to compare characters from both ends of the string
         while (i < j) {
             // Compare characters at the `i` and `j-1` positions
             if (s1.charAt(i) == s1.charAt(j - 1)) {
                 i++; // Move the `i` pointer forward
                 j--; // Move the `j` pointer backward
             } else {
                 // If characters don't match, set `p` to false and break the loop
                 p = false;
                 break;
             }
         }
 
         // Check the flag `p` to determine if the string is a palindrome
         if (p) {
             System.out.println("Your String " + s1 + " is Palindrome"); // Palindrome case
         } else {
             System.out.println("Your String " + s1 + " is not Palindrome"); // Not a palindrome
         }
     }
 }
 