/*
 * Problem: Dungeon Game
 * Problem ID: 174
 * Difficulty: Hard
 * Language: Java
 * Runtime: 2 ms
 * Memory: 45.4 MB
 * Synced From: LeetCode
 * Date: 2026-10-11
 */

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length; 
        int n = dungeon[0].length; 
        int [][] dp = new int[m][n];
        dp[m-1][n-1] = Math.max(1 - dungeon[m-1][n-1], 1);
        for(int i = m-2; i >= 0; i--){
            int healthrow = dp[i+1][n-1] - dungeon[i][n-1];
            if(healthrow <= 0){
                dp[i][n-1] = 1;
            }
            else{
                dp[i][n-1] = healthrow;
            }
        }
        for(int j = n-2; j >= 0; j--){
            int healthcol = dp[m-1][j+1] - dungeon[m-1][j];
            if(healthcol <= 0){
                dp[m-1][j] = 1;
            }
            else{
                dp[m-1][j] = healthcol;
            }
        }
        for(int i = m-2; i >= 0; i--){
            for(int j = n-2; j >= 0; j--){
                int needAfter = Math.min(dp[i+1][j], dp[i][j+1]);
                dp[i][j] = Math.max(1, needAfter - dungeon[i][j]);
            }
        }
        return dp[0][0];
    }
}