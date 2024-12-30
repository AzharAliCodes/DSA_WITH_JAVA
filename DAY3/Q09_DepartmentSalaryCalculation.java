// This program demonstrates method overriding with an abstract class to calculate total salaries for different departments.

package dsa_with_java.DAY3;

// Abstract class department
abstract class department {
    double sal, bonus, totsal;

    // Abstract method to calculate total salary
    abstract public void calculateTotalSalary(double sal);

    // Method to display the department name, salary, bonus, and total salary
    public void display(String name) {
        System.out.println("Department Name: " + name + 
                           " | Salary: " + sal + 
                           " | Bonus: " + bonus + 
                           " | Total Salary: " + totsal);
    }
}

// Account department subclass
class Account extends department {
    // Overridden method to calculate total salary for the Account department
    public void calculateTotalSalary(double sal) {
        this.sal = sal;  // Assign the base salary
        bonus = sal * 0.1;  // Calculate a 10% bonus
        totsal = sal + bonus;  // Calculate total salary
    }
}

// Sales department subclass
class sales extends department {
    // Overridden method to calculate total salary for the Sales department
    public void calculateTotalSalary(double sal) {
        this.sal = sal;  // Assign the base salary
        bonus = sal * 0.2;  // Calculate a 20% bonus
        totsal = sal + bonus;  // Calculate total salary
    }
}

// Main class to test the functionality
public class Q09_DepartmentSalaryCalculation {
    public static void main(String[] args) {
        // Create an instance of the Sales department and calculate total salary
        department sales = new sales();
        sales.calculateTotalSalary(5000);
        sales.display("Sales");

        // Create an instance of the Account department and calculate total salary
        department account = new Account();
        account.calculateTotalSalary(4000);
        account.display("Account");
    }
}
