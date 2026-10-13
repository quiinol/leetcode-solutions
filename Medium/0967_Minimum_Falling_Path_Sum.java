/*
 * Problem: Minimum Falling Path Sum
 * Problem ID: 967
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 47.3 MB
 * Synced From: LeetCode
 * Date: 2026-10-13
 */

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] dp = new int[m][n];
        if(m == 1 && n == 1 ){
            return matrix[m-1][n-1];
        }
        if(n == 1){
            for(int x = 0; x < m; x++){
                int sum = 0;
                sum += dp[x][0];
                return sum;
            }
        }
        for(int j = 0; j < n; j++){
            dp[0][j] = matrix[0][j];
        }
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j == 0){
                    dp[i][j] = Math.min(dp[i-1][j] + matrix[i][j], dp[i-1][j+1] + matrix[i][j]);
                }
                else if(j == n-1){
                    dp[i][j] = Math.min(dp[i-1][j] + matrix[i][j], dp[i-1][j-1] + matrix[i][j]);
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j-1] + matrix[i][j], Math.min(dp[i-1][j] + matrix[i][j], dp[i-1][j+1] + matrix[i][j]));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int k = 0; k < n; k++){
            min = Math.min(min, dp[m-1][k]);
        }
        return min;
    }

}