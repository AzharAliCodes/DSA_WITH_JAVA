//This prgram show you about linear/sequntaional search 
import java.util.*;
public class Q9_LinearSearch_Array {
    public static void main(String[] args){
        int arr[],i,n,num,f=0;
        boolean first=false;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements of array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the search elements ");
        num=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==num){
                first=true;
                f=i; 
                break;
            }
        }
        if(first)
            System.out.println("Element "+num+" found at index "+(f+1));
        else
            System.out.println("Element "+num+" not found");
    }
}
