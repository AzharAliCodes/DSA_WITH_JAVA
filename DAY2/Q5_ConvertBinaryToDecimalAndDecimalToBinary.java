import java.util.Scanner;

public class Q5_ConvertBinaryToDecimalAndDecimalToBinary {

    // Function to convert Binary to Decimal
    public static void BinaryToDecimal(int binaryNumber) {
        int power = 0;
        int decimalNumber = 0;

        // Conversion logic
        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10; // Extract the last digit
            decimalNumber += lastDigit * (int) Math.pow(2, power); // Add to decimal value
            power++;
            binaryNumber /= 10; // Remove the last digit
        }

        // Display the decimal number
        System.out.println("Decimal number = " + decimalNumber);
    }

    // Function to convert Decimal to Binary
    public static void DecimalToBinary(int decimalNumber) {
        int binaryNumber = 0;
        int power = 0;

        // Conversion logic
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2; // Get remainder when divided by 2
            binaryNumber += remainder * (int) Math.pow(10, power); // Add to binary value
            power++;
            decimalNumber /= 2; // Divide by 2
        }

        // Display the binary number
        System.out.println("Binary number = " + binaryNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Binary to Decimal Conversion:");
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        BinaryToDecimal(binary);

        System.out.println("\nDecimal to Binary Conversion:");
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        DecimalToBinary(decimal);

        sc.close();
    }
}





    

