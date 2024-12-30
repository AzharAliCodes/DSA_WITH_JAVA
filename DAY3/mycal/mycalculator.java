// Package declaration for the custom package 'mycal'
package mycal;

// Defining the class 'mycalculator' which contains methods for basic arithmetic operations
public class mycalculator {

    // Method to add two integers
    public int add(int a, int b) {
        // Returns the sum of a and b
        return a + b;
    }

    // Method to subtract the second integer from the first
    public int subtract(int a, int b) {
        // Returns the difference between a and b
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        // Returns the product of a and b
        return a * b;
    }

    // Method to divide the first integer by the second
    public double divide(int a, int b) {
        // If b is zero, it throws an ArithmeticException as division by zero is not allowed
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        } else {
            // Returns the result of division as a double value
            return (double) a / b;
        }
    }
}
