package dsa_with_java.DAY3;
class Q3facotrial_with_command_line_Argument { 
    public static void main(String args[]) {
        long res = 1; // To store factorial results
        int i, n = args.length; // `n` is the count of command-line arguments
        for (i = 0; i < n; i++) {
            res = 1;
            int num = Integer.parseInt(args[i]); // Convert command-line argument to integer
            for (int j = num; j > 0; j--) {
                res = res * j; // Calculate factorial
            }
            System.out.println("Factorial of " + num + " = " + res);
        }
    }
}
