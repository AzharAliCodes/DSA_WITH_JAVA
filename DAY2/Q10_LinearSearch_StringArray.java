// This program demonstrates the use of Linear Search in a string array. 
// The user can input a list of strings and search for a specific string in the array. 
// The program allows the user to choose between two types of searches:
// 1. Case-sensitive search (exact match)
// 2. Case-insensitive search (ignores case differences) 
// The program will then display the index of the string if found or a message if the string is not found in the array.

import java.util.*;

public class Q10_LinearSearch_StringArray {
    public static void main(String[] args) {
        // Declare variables
        int n, i, num = -1;
        boolean search = false;
        String[] array;
        String searchstring;

        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Step 1: Take the size of the array from the user
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character after nextInt()

        // Step 2: Initialize the array with the size entered by the user
        array = new String[n];
        System.out.println("Enter " + n + " strings:");

        // Step 3: Take 'n' strings from the user and store them in the array
        for (i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        // Step 4: Take the string to search for from the user
        System.out.println("Enter the search string:");
        searchstring = sc.nextLine();

        // Step 5: Ask the user whether they want to perform a case-sensitive or case-insensitive search
        System.out.println("How to search press [1 for search string normally] press [2 for search string but ignore case]:");
        int choice = sc.nextInt();

        // Step 6: Perform the search based on the user's choice using a switch-case structure
        switch (choice) {
            // Case 1: Case-sensitive search
            case 1:
                // Loop through the array and check if any element matches the search string exactly
                for (i = 0; i < n; i++) {
                    if (array[i].equals(searchstring)) {
                        search = true; // Set search to true if a match is found
                        num = i; // Store the index of the found string
                        break; // Exit the loop once a match is found
                    }
                }  
                break;
            
            // Case 2: Case-insensitive search
            case 2:
                // Loop through the array and check if any element matches the search string, ignoring case
                for (i = 0; i < n; i++) {
                    if (array[i].equalsIgnoreCase(searchstring)) {
                        search = true; // Set search to true if a match is found
                        num = i; // Store the index of the found string
                        break; // Exit the loop once a match is found
                    }
                }
                break;

            // Default case: If the user enters an invalid option
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        // Step 7: Output the result of the search
        if (search) {
            System.out.println(searchstring + " found at index " + (num + 1)); // Display the found index (1-based index)
        } else {
            System.out.println(searchstring + " is not found."); // If no match is found
        }
    }
}
