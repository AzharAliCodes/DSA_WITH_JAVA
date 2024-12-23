import java.util.*;
class Q11_LargestAndSmallestInArray{
    public static void main(String args[]){
    int arr[]={2,9,7,4,8,1};
    System.out.println("Largest number in array: "+getllarsgest(arr));
    System.out.println("Smallest number in array: "+getSmallest(arr));
 }
 public static int getllarsgest(int arr[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if (arr[i]>largest){
            largest=arr[i];
        }
    }
    return largest;
}
public static int getSmallest(int arr[]){
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if (arr[i]<smallest){
            smallest=arr[i];
        }
    }
    return smallest;
 }
}