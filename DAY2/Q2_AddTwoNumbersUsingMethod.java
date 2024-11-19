//This program takes two numbers as input from the user and calculates their sum using a separate method,
// Addtwonumber(int x, int y). 
//The method returns the sum of the two integers, and the result is displayed in the main method.
import java.util.*;
public class Q2_AddTwoNumbersUsingMethod {
    public static void main(String[] args){
        int a,b;
        System.out.print("Enter two numver");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        int c=Addtwonumber(a,b);
        System.out.println("Sum of "+a+" and "+b+" is: "+c);
    }
    public static int Addtwonumber(int x,int y) {
             return x+y;   
    }
    
}
//And this prgram is called function with argument and with return type
