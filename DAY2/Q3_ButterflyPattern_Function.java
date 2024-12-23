//And this prgram is called function with argument and not return type
public class Q3_ButterflyPattern_Function {
    public static void butter_fly(int n) {
        // Upper part of the butterfly
        for (int i = n; i > 0; i--) {  // Include 'i == 0' to print all rows
            for (int j = i; j < n; j++) { // First star part
                System.out.print("*");
            }
            int k = 2 * i - 1;  // Space part
            while (k > 0) {
                System.out.print(" ");
                k--;
            }
            for (int j = i; j < n; j++) { // Last star part
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part (mirror part)
        for (int i = 1; i <= n; i++) {  // Start from 1 to match the mirror part
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            int k = 2 * i - 1;  // Space part
            while (k > 0) {
                System.out.print(" ");
                k--;
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butter_fly(5);  // Call the butterfly function with size 5
    }
}
