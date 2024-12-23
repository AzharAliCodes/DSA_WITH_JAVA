import java.util.*;

public class Q10_LinearSearch_StringArray {
    public static void main(String[] args) {
        int n, i, num = -1;
        boolean search = false;
        String[] array;
        String searchstring;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        array = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        System.out.println("Enter the search string:");
        searchstring = sc.nextLine();

        System.out.println("How to search press [1 for search string normally] press [2 for search string but ignore case]:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            for (i = 0; i < n; i++) {
                if (array[i].equals(searchstring)) {
                    search = true;
                    num = i;
                    break;
                }
            }  
              break;
            
            case 2:
                for (i = 0; i < n; i++) {
                if (array[i].equalsIgnoreCase(searchstring)) {
                    search = true;
                    num = i;
                    break;
                }
            }
             break;


            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }

        if (search) {
            System.out.println(searchstring + " found at index " + (num+1));
        } else {
            System.out.println(searchstring + " is not found.");
        }
    }
}
