package dsa_with_java.DAY3;
// Program to demonstrate various string operations in Java

public class Q05_StringOperations {
    public static void main(String[] args) {
        // Initialization of strings
        String s1 = new String("anjuman bca college");
        String s2 = "ANJUMAN BCA COLLEGE";

        // Displaying the strings
        System.out.println("The string s1 is: " + s1);
        System.out.println("The string s2 is: " + s2);

        // Length of s1
        System.out.println("The length of the string s1: " + s1.length());

        // Finding the first occurrence of 'c' in s1
        System.out.println("The first occurrence of 'c' in string s1: " + s1.indexOf('c'));

        // Converting s2 to lowercase
        System.out.println("The lowercase of s2: " + s2.toLowerCase());

        // Converting s1 to uppercase
        System.out.println("The uppercase of s1: " + s1.toUpperCase());

        // Comparing s1 and s2 for equality (case-sensitive)
        System.out.println("s1 is equal to s2: " + s1.equals(s2));

        // Comparing s1 and s2 for equality (case-insensitive)
        System.out.println("s1 is equal to s2 ignoring case: " + s1.equalsIgnoreCase(s2));

        // Comparing s1 and s2 using compareTo()
        int result = s1.compareTo(s2);
        System.out.println("After compareTo():");
        if (result == 0) {
            System.out.println(s1 + " is equal to " + s2);
        } else if (result > 0) {
            System.out.println(s1 + " is greater than " + s2);
        } else {
            System.out.println(s1 + " is smaller than " + s2);
        }

        // Accessing a character at a specific index in s1
        System.out.println("Character at index 9 in s1: " + s1.charAt(9));

        // Extracting a substring from s1
        String s3 = s1.substring(4, 12);
        System.out.println("Extracted substring from index 4 to 12: " + s3);

        // Replacing 'b' with 'm' in s1
        System.out.println("After replacing 'b' with 'm' in s1: " + s1.replace('b', 'm'));

        // Trimming whitespaces from s4
        String s4 = "  This is a book  ";
        System.out.println("The string s4 is: " + s4);
        System.out.println("After trim(): " + s4.trim());

        // Concatenating two strings
        String s5 = "Mudasir";
        String s6 = "Syed";
        String s7 = s6.concat(s5);
        System.out.println("Concatenating " + s6 + " and " + s5 + ": " + s7);
    }
}
