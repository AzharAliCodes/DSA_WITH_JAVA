// This program prints an inverted right-angle triangle pattern using stars (*).
// The number of stars decreases with each new line, starting from 4 and going down to 1.
public class Q03_PrintInvertedRightAngleTrianglePattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4;i++){         //print number of line
            for (int j = 3; j >= i; j--){   //print for each line how many star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
