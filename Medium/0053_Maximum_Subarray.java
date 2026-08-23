/*
 * Problem: Maximum Subarray
 * Problem ID: 53
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 80.7 MB
 * Synced From: LeetCode
 * Date: 2026-08-23
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}