/**given a route containing 4 directions (E, W, N, s),
 *  find the shortest path to reach destination
**/
public class Q03_ShortestPathInRoute {
    public static void main(String[] args) {
        int x = 0, y = 0; // Initialize starting position at (0,0)
        String str = "WNEENESENNN"; // Route string containing directions

        // Calculate the shortest path and store the result in 'sp'
        int sp = findShortestPath(x, y, str);

        // Print the shortest path length (Euclidean distance)
        System.out.println("Shortest path length: " + (float) Math.sqrt(sp));
    }

    // Method to find the squared distance to the destination
    public static int findShortestPath(int x, int y, String str) {
        int len = str.length(); // Length of the route string

        // Iterate over each character in the route string
        for (int i = 0; i < len; i++) {
            switch (str.charAt(i)) { // Check the current direction
                case 'W': // Move west
                case 'w': 
                    x--; 
                    break;
                case 'E': // Move east
                case 'e': 
                    x++; 
                    break;
                case 'N': // Move north
                case 'n': 
                    y++; 
                    break;
                case 'S': // Move south
                case 's': 
                    y--; 
                    break;
                default: 
                    break; // Ignore invalid characters
            }
        }

        // Print the final destination coordinates
        System.out.println("(" + x + "," + y + ")");

        // Calculate the squared distance (x² + y²)
        int sp = (x * x) + (y * y);
        return sp; // Return the squared distance
    }
}
