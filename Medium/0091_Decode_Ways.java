/*
 * Problem: Decode Ways
 * Problem ID: 91
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43 MB
 * Synced From: LeetCode
 * Date: 2026-09-25
 */

class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int [] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2; i < n + 1; i++){
            int onedigit = Integer.valueOf(s.substring(i-1, i));
            int twodigit = Integer.valueOf(s.substring(i-2, i));
            if(onedigit > 0){
                dp[i] = dp[i - 1];
            }
            if(twodigit >= 10 && twodigit <= 26){
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}