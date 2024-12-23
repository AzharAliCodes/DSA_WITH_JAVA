//This program demonstrates the use of a method in Java to print "Hello World!" multiple times.
// The printhello() method is defined separately and called twice within the main() method to display the message.
class Q01_PrintHelloWorldMethod {
    public static void printhello(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args){
        printhello(); // calling the method recursively
        printhello(); 
    }
}
//And this prgram is called function with no argument and bno return type
