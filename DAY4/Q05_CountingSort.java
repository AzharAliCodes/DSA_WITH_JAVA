package dsa_with_java.DAY4;

import java.util.*;

public class Q05_CountingSort {
    public static void main(String[] args) {
       int countingsort[],arr[]={1,4,1,2,3,4,3,7};
       int min = Arrays.stream(arr).min().getAsInt();
       int max = Arrays.stream(arr).max().getAsInt();
       countingsort=new int[max+min+1];   
       for(int i=min;i<max+1;i++){
           int n=arr[i];
           for(int j=n;j<=n;j++){
             countingsort[j]++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println( countingsort[i]);
        }
    }
}
