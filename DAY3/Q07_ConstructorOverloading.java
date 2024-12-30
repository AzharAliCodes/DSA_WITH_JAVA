// This program demonstrates constructor overloading in Java.

package dsa_with_java.DAY3;

// Class to represent a box with dimensions
class box {
    double width, height, depth;

    // Constructor to initialize width, height, and depth with specific values
    box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Default constructor to initialize all dimensions to zero
    box() {
        width = height = depth = 0;
    }

    // Constructor to initialize all dimensions to the same value
    box(double len) {
        width = height = depth = len;
    }

    // Method to calculate the volume of the box
    double volume() {
        return width * height * depth;
    }
}

// Main class to test the functionality
public class Q07_ConstructorOverloading {
    public static void main(String[] args) {
        // Creating objects of the box class using different constructors
        box b1 = new box(5, 4, 3); // Box with specific dimensions
        box b2 = new box(7);       // Cube-like box with all sides equal
        box b3 = new box();        // Default box with zero dimensions

        // Calculating and displaying volumes of each box
        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
        System.out.println("Volume of b3: " + b3.volume());
    }
}
