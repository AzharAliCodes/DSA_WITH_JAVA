//Given n non-negative integes representing an elevationmap where the width of each bar is 1,
//compute how much water it can trap after raining.
//Using auxiliary/helpper arrays
import java.lang.*;

public class Q19_TrappingRainWater {
    public static void main(String[] args) {
        int min1, tp = 0, temp1, temp2;
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        
        // Create helper arrays
        int left_max_boundary[] = new int[height.length];
        int right_max_boundary[] = new int[height.length];
        
        // Initialize the left_max_boundary array
        left_max_boundary[0] = temp1 = height[0];
        
        // Initialize the right_max_boundary array
        right_max_boundary[height.length - 1] = temp2 = height[height.length - 1];

        // Check if the input array has less than or equal to 2 elements
        if (height.length <= 2) {
            System.out.println("No water trapped");
        } else {
            // Fill the left_max_boundary array
            for (int i = 1; i < height.length; i++) {
                if (temp1 > height[i]) {
                    left_max_boundary[i] = temp1;
                } else {
                    left_max_boundary[i] = height[i];
                    temp1 = height[i];
                }
            }

            // Fill the right_max_boundary array
            for (int i = height.length - 2; i >= 0; i--) {  // Fix: start from the second last element
                if (temp2 > height[i]) {
                    right_max_boundary[i] = temp2;
                } else {
                    right_max_boundary[i] = height[i];
                    temp2 = height[i];
                }
            }

            // Calculate the total water trapped
            for (int i = 1; i < height.length - 1; i++) {
                min1 = Math.min(left_max_boundary[i], right_max_boundary[i]);
                tp = tp + (min1 - height[i]);
            }

            // Output the result
            if (tp > 0)
                System.out.println("Total trapped water = " + tp);
            else
                System.out.println("No water trapped");
        }
    }
}
