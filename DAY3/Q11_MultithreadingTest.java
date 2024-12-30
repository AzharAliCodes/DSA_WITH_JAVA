// This program demonstrates multithreading by creating and starting three threads (A, B, and C).
// Each thread performs the task of printing numbers from 0 to 4 independently, showcasing concurrent execution.

package dsa_with_java.DAY3;

class A extends Thread {
    public void run() {
        // This loop iterates from 0 to 4, printing the value of i for Thread A
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A: " + i);
        }
        // Indicates that Thread A has completed its task
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        // This loop iterates from 0 to 4, printing the value of i for Thread B
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread B: " + i);
        }
        // Indicates that Thread B has completed its task
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        // This loop iterates from 0 to 4, printing the value of i for Thread C
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread C: " + i);
        }
        // Indicates that Thread C has completed its task
        System.out.println("Exit from C");
    }
}

public class Q11_MultithreadingTest {
    public static void main(String[] args) {
        // Starting threads A, B, and C
        new A().start();  // Starts execution of thread A
        new B().start();  // Starts execution of thread B
        new C().start();  // Starts execution of thread C
    }
}
