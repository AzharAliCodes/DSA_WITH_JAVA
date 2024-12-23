//This program prints a diamond pattern using stars (*).
// The diamond consists of two symmetrical halves: the top half forms an expanding triangle, and the bottom half is a mirrored, contracting triangle.
// Spaces are added on the left to center-align the diamond shape.
public class Q13_PrintDiamondPattern {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {  //This indicate number of line
            int m=n-i;
            while (m!=0){               //This is the space before the dimond
                System.out.print(" ");
                m--;
            }
            int k=2*(i-1)+1;            //this is the creating dimond logic
            while(k!=0) {
                System.out.print("*");
                k--;
        }
        System.out.println();
    }
     //this is mirror part of above loop
    for (int i = n; i > 0; i--) {
        int m=n-i;
        while (m!=0){
            System.out.print(" ");
            m--;
        }
        int k=2*(i-1)+1;
        while(k!=0) {
            System.out.print("*");
            k--;
    }
    System.out.println();
}
}
}
