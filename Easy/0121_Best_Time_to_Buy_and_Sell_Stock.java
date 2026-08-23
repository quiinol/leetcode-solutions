/*
 * Problem: Best Time to Buy and Sell Stock
 * Problem ID: 121
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 94.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-23
 */

class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int highest = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lowest){
                lowest = prices[i];
            }
            else{
                highest = Math.max(highest, prices[i] - lowest);
            }
        }
        return highest;
    }
}