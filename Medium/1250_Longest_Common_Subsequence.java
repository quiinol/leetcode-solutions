/*
 * Problem: Longest Common Subsequence
 * Problem ID: 1250
 * Difficulty: Medium
 * Language: Java
 * Runtime: 21 ms
 * Memory: 53.5 MB
 * Synced From: LeetCode
 * Date: 2026-11-13
 */

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int [][] dp = new int[l1+1][l2+2];
        for(int i = 1; i <= l1; i++){
            for(int j = 1; j <= l2; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[l1][l2];
    }
}