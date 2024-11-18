//This program demonstrates the use of a method in Java to print "Hello World!" multiple times.
// The printhello() method is defined separately and called twice within the main() method to display the message.
class Q1_PrintHelloWorldMethod {
    public static void printhello(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args){
        printhello(); // calling the method recursively
        printhello(); 
    }
}
