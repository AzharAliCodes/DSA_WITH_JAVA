//This program prints a binary triangle pattern. 
//Each row contains alternating 0s and 1s, starting from 1 at the beginning of the first row. 
//The number of elements in each row matches the row number, with the binary digits toggling alternately.
public class Q10_PrintBinaryTriangle {
 public static void main(String[] args){
    int n=0;
    for (int i = 1; i <= 5;i++){
        for (int j = 0;j < i;j++){
            if(n==0)//it convert binary number that is 0 to 1 and 1 to 0
                n=1;
            else
                n=0;
            System.out.print(n);
        }
        System.out.println();
    }
 }
}
