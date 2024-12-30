package dsa_with_java.DAY3;
import java.util.*;

public class Q01circle {
    
        public static void main(String[] args) {
            // Variables for area, circumference, radius, and the value of pi
            float area, circum, radius, pi = 3.14f;
    
            // Create Scanner object for user input
            Scanner sc = new Scanner(System.in);
    
            // Prompt the user to enter the radius of the circle
            System.out.print("Enter the radius of the circle: ");
            radius = sc.nextFloat();
    
            // Calculate the area of the circle
            area = pi * radius * radius;
    
            // Calculate the circumference of the circle
            circum = 2 * pi * radius;
    
            // Print the results
            System.out.println("Area of the circle = " + area);
            System.out.println("Circumference of the circle = " + circum);
        }
    }
    