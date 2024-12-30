// This program demonstrates method overloading in Java using the 'methodo' class.

package dsa_with_java.DAY3;

// Class to demonstrate method overloading
class methodo {
    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two double values
    public double add(double a, double b) {
        return a + b;
    }
}

// Main class to test the functionality of method overloading
public class Q06_MethodOverloading {
    public static void main(String[] args) {
        // Create an object of the 'methodo' class
        methodo obj = new methodo();

        // Call different 'add' methods based on the arguments
        System.out.println("Addition of two integers: " + obj.add(5, 3));       // Calls Method 1
        System.out.println("Addition of three integers: " + obj.add(5, 3, 2)); // Calls Method 2
        System.out.println("Addition of two doubles: " + obj.add(5.5, 3.3));   // Calls Method 3
    }
}
