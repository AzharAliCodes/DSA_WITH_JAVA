// This program demonstrates exception handling in Java using a try-catch block.
// It attempts to access an invalid array index, which will trigger an ArrayIndexOutOfBoundsException.
package dsa_with_java.DAY3;
class ArrayExceptionHandling {
    int arr[] = {10, 20, 30, 40};  // Array with 4 elements

    // Instance block for handling exceptions
    {
        try {
            System.out.println("4th index of array is " + arr[4]);  // Invalid index, will throw exception
            System.out.println("5th index of array is " + arr[5]);  // Invalid index, will throw exception
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bound Exception: " + e);
        } 
        catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
    }
}

public class Q10_ExceptionHandlingTest {
    public static void main(String[] args) {
        ArrayExceptionHandling exp = new ArrayExceptionHandling();
        System.out.println("Program completed");
    }
}
