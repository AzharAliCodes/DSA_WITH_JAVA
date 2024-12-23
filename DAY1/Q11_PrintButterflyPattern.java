//This program prints a butterfly pattern using stars (*).
// The pattern consists of two mirrored halves: the upper half expands outward, while the lower half contracts inward. 
//The stars are aligned symmetrically, with spaces in the middle dividing the two wings of the butterfly.
public class Q11_PrintButterflyPattern {
    public static void main(String[] args){
        int n=5;
       for (int i = n-1; i > 0;i--){  //This indicate number of line in a loop
        for (int j = i; j < n ; j++) {//this is the first star vpart
            System.out.print("*");
        }
        int k= 2*i-1;
        while(k>0){    //This is the space part
            System.out.print(" ");
            k--;
        }
        for (int j = i; j < n; j++){  //This is the last star part
            System.out.print("*");
        }
        System.out.println();
     }
     //this is mirror part of above loop
        for (int i = 1; i < n;i++){
            for (int j = i; j < n; j++){
                System.out.print("*");
            }
            int k= 2*i-1;
            while(k>0){
                System.out.print(" ");
                k--;
            }
            for (int j = i; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
