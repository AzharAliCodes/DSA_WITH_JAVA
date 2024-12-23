//This program prints a hollow rhombus pattern using stars (*). 
//The rhombus is tilted, with spaces on the left to align the structure diagonally. 
//The border of the rhombus is formed with stars, while the inside remains hollow.
public class Q12_PrintHollowRhombus {
    public static void main(String[] args) {
        int n = 5,k =n-1;
        for (int i = 1; i <= n;i++){  //This indicate number of line
        while (k>0){                  //This indicate space before the hollow rhomous
            System.out.print(" ");
            k--;
        }
            for (int j=1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n){  //This is compltely hollow rhombus
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            k=(n-1)-i;
        }
    }
    
}