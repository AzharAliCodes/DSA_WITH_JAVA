// This program prints a number pattern where each line contains numbers starting from 1 up to the current line number.
// The first line contains 1, the second line contains 1 and 2, and so on.

public class Q04_PrintNumberPattern {
    public static void main(String[] args) {
        for (int i = 0;i < 4;i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
    
    }
}
}