//This program prints an incremental number pyramid pattern. 
//Each row starts with consecutive numbers, increasing sequentially from the last printed number.
// The number of elements in each row matches the row's index (starting from 1).
public class Q09_PrintIncrementalNumberPyramid {
    public static void main(String[] args) {
        int n=1,m=5;
        for (int i=0;i<m;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print(n + " " );
                n++;
    }
    System.out.println("");
    }
 }
}