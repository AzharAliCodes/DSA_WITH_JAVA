package dsa_with_java.DAY3;

public class Q2prime_number_with_command_line_Argument {
        public static void main(String args[]) {
            boolean prime; // Variable to track if a number is prime
            int i, n = args.length; // n stores the number of command-line arguments
            // Loop through each command-line argument
            for (i = 0; i < n; i++) {
                prime = true; // Assume the number is prime initially
                int num = Integer.parseInt(args[i]); // Convert string argument to integer
                // Check if the number is divisible by any number between 2 and num-1
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        prime = false; // Not prime if divisible by j
                        break; // Exit the loop as we've already determined it's not prime
                    }
                }
                // Output the result
                if (prime && num > 1) {
                    System.out.println(num + " is prime");
                } else {
                    System.out.println(num + " is not prime");
                }
            }
        }
    }
    