// This program prints a right-angle triangle pattern using stars (*).
// The number of stars increases with each new line, starting from 1 and going up to 4 in
public class Q02_PrintRightAngleTrianglePattern {
    public static void main(String[] args) {
        for(int i = 0;i < 4;i++) {   // number of line which you have to print
            for(int j = 0; j <= i; j++) {  //number of star print in the line
                System.out.print("* ");
            }
            System.out.println();
    }
}
}
