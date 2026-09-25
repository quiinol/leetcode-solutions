/*
 * Problem: House Robber
 * Problem ID: 198
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.8 MB
 * Synced From: LeetCode
 * Date: 2026-09-25
 */

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2; i < n + 1; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }     
        return dp[n];
    }
}