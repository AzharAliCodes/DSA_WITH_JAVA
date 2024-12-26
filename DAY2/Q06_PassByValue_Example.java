//pass by value concept
public class Q06_PassByValue_Example {
      public static void main(String[] args) {
            int a,b;
            a = 5;
            b = 10;
            swap(a,b);
            System.out.println("In main function that values are it show the pass by value concept");
            System.out.println("a = " + a + "\nb = " + b);

    }
    static void swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("In Swap Method: \na = " + a + "\nb = " + b);

    }
}
