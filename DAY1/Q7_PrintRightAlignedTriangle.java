//This program prints a right-aligned triangle pattern of stars (*). 
//It first prints spaces on the left side for alignment, followed by stars in each line. 
//The number of stars increases with each line, creating a right-aligned triangle.
class Q7_PrintRightAlignedTriangle{
    public static void main(String[] args){
        int n=4;
        for (int i = 1; i <= n;i++){
            int c=n-i;
            boolean b=true;
            for  (int j = 1;j <= n;j++){
                if(c==0)
                  b=false;
                if(true==b)
                {
                    System.out.print(" ");
                    c--;
                }
                else
                    System.out.print("*");
            } System.out.println("");
        }
    }
}
