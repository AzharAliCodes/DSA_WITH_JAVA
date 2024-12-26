import java.util.*;
//This program show the declartion of array and simple opration on array that array all element sum.

class Q07_SimpleArray_Implementation{
    public static void main(String[] args) {
        int arr[],n,num=0;
        arr=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements of the array:");
        n=sc.nextInt();
        System.out.println("Enter "+n+" elements into array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            num=arr[i]+num;
        }
        System.out.println("the number of elements in the array is "+n+" and there total is "+num);
    }
}