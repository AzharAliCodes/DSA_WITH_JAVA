//java does not support pass by reference so that here we use array so we cover pss by reference concept
public class Q08_PassByReference_ArrayModification {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("Before modification:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        modifyArray(arr);
        System.out.println("After modification:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void modifyArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int n=arr[i]+2;
            arr[i]=n; //changing the value in the original array which is passed by reference.
        }
        return;
    }
}
