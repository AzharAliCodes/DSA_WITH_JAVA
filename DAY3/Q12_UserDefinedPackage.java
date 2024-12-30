// Q13 - User Defined Package: Test Program for 'mycalculator'

// Importing the 'mycalculator' class from the 'mycal' package located in 'dsa_with_java.DAY3'
import mycal.mycalculator;

public class Q12_UserDefinedPackage {
    public static void main(String[] args) {
        // Creating an instance of the 'mycalculator' class
        mycalculator cal =new mycalculator();

        // Using the 'add' method to perform addition
        System.out.println("Addition: " + cal.add(10, 20));

        // Using the 'subtract' method to perform subtraction
        System.out.println("Subtraction: " + cal.subtract(10, 20));

        // Using the 'multiply' method to perform multiplication
        System.out.println("Multiplication: " + cal.multiply(10, 20));

        // Using the 'divide' method to perform division
        System.out.println("Division: " + cal.divide(10, 20));
    }
}
