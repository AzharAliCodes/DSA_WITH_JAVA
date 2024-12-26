//This program prints a descending number pyramid pattern.
// Each row contains numbers starting from 1 up to the current row's size, with the number of columns decreasing in each subsequent row.
class Q08_PrintNumberPyramidDescending{
    public static void main(String args[]){
        int n=5;
        for (int i = n; i > 0;i--){
            for (int j = 1; j <= n;j++){
             System.out.print(j);
            }
        System.out.println("");
        n--;
        }
    }
}