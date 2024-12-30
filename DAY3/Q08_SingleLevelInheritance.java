// This program demonstrates single-level inheritance to calculate total salary for a department.

package dsa_with_java.DAY3;

// Parent class: department
class department {
    double sal, bonus, totsal;

    // Method to display the department name, salary, bonus, and total salary
    public void display(String name) {
        System.out.println("Department Name: " + name + 
                           " | Salary: " + sal + 
                           " | Bonus: " + bonus + 
                           " | Total Salary: " + totsal);
    }
}

// Child class: sales (inherits from department)
class sales extends department {
    // Method to calculate total salary for the Sales department
    public void calculateTotalSalary(double sal) {
        this.sal = sal;  // Assign the base salary
        bonus = sal * 0.2;  // Calculate a 20% bonus
        totsal = sal + bonus;  // Calculate total salary
    }
}

// Main class to test the functionality
public class Q08_SingleLevelInheritance {
    public static void main(String[] args) {
        // Create an instance of the Sales department
        sales sales = new sales();
        
        // Calculate total salary for the Sales department
        sales.calculateTotalSalary(5000);

        // Display the results
        sales.display("Sales");
    }
}
