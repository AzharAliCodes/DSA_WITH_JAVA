import java.util.Scanner;

public class Q4_SquareCalculator_Function {

    // Function with no argument but return type
    public static int calculateSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its square: ");
        int number = sc.nextInt();
        return number * number; // Returns the square of the number
    }

    public static void main(String[] args) {
        // Call the function and store the returned value
        int square = calculateSquare();

        // Display the result
        System.out.println("The square of the entered number is: " + square);
    }
}
