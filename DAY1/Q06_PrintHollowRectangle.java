// This program prints a hollow rectangle pattern using stars (*).
// The rectangle has stars only on the borders, leaving the center hollow.
public class Q06_PrintHollowRectangle {  
    public static void main(String[] args) {
     int n=4,m=5;
       for (int row = 0; row < n; row++) {        //This print the row
            for(int col = 0;col < m;col++) {      //This print the column
               if(row==0||row==n-1||col==0||col==m-1)  //This check the condition annd if row or coulm not touch to the border it will print a blanck space
                    System.out.print("*");
               else
                    System.out.print(" ");
               }
               System.out.println("");       
          }
  }
}
