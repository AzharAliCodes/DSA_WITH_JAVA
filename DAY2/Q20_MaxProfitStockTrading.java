// This program calculates the maximum profit that can be achieved from a single stock trade.
// It identifies the best day to buy and sell to maximize profit.

import java.lang.*;
public class Q20_MaxProfitStockTrading {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int j = 0; // Index to track the day of buying
        int profit = 0; // Maximum profit initialized to 0
        int buyprice = Integer.MAX_VALUE; // Minimum buy price initialized to a large value

        // Loop to find the minimum price (best day to buy)
        for (int i = 0; i < prices.length; i++) {
            if (buyprice > prices[i]) { // If the current price is less than the buyprice
                buyprice = prices[i]; // Update the buy price
                j = i; // Track the index of the buying day
            }
        }

        // Loop to calculate the maximum profit
        for (int i = j; i < prices.length; i++) { // Start from the buying day
            if (prices[i] > buyprice) { // If the selling price is higher than the buy price
                profit = Math.max(profit, prices[i] - buyprice); // Update the maximum profit
            }
        }

        // Print the maximum profit
        System.out.println("Profit = " + profit); 
    }
}
