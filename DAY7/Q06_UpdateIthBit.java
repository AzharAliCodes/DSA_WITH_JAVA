package dsa_with_java.DAY7;

public class Q06_UpdateIthBit {
    public static void main(String[] args) {
        System.out.println(updatebit(10, 2, 1));
    } 
     // Function to clear the i-th bit of the number `n` (set it to 0)
     public static int ClearIthBit(int n, int i) {
        int bitmask = ~(1 << i); // Create a bitmask by shifting 1 to the i-th position and negating it
        return n & bitmask; // Use the AND operator to clear the i-th bit
    }

    public static int updatebit(int n,int i,int newBit){
        n= ClearIthBit(n,i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }
}
