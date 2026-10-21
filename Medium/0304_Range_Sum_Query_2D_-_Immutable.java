/*
 * Problem: Range Sum Query 2D - Immutable
 * Problem ID: 304
 * Difficulty: Medium
 * Language: Java
 * Runtime: 113 ms
 * Memory: 140.6 MB
 * Synced From: LeetCode
 * Date: 2026-10-21
 */

class NumMatrix {
    int[][] dp;

    public NumMatrix(int[][] matrix) { 
        if(matrix.length == 0 || matrix[0].length == 0){
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        dp = new int [m][n];
        dp[0][0] = matrix[0][0];
        for(int i = 1; i < m; i++){
            dp[i][0] = dp[i-1][0] + matrix[i][0];
        }
        for(int j = 1; j < n; j++){
            dp[0][j] =  dp[0][j-1] + matrix[0][j];
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + matrix[i][j];
            }
        } 
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        //     return 0;
        // }
        // int m = matrix.length;
        // int n = matrix[0].length;
        int r1 = row1;
        int r2 = row2;
        int c1 = col1;
        int c2 = col2;
        // int[][] dp = new int [m][n];
        // dp[0][0] = matrix[0][0];
        // for(int i = 1; i < m; i++){
        //     dp[i][0] = dp[i-1][0] + matrix[i][0];
        // }
        // for(int j = 1; j < n; j++){
        //     dp[0][j] =  dp[0][j-1] + matrix[0][j];
        // }
        // for(int i = 1; i < m; i++){
        //     for(int j = 1; j < n; j++){
        //         dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + matrix[i][j];
        //     }
        // }
        int total = dp[r2][c2];
        int top = (row1 > 0) ? dp[row1 - 1][col2] : 0;
        int left = (col1 > 0) ? dp[row2][col1 - 1] : 0;

        int topleft = (row1 > 0 && col1 > 0)? dp[row1 - 1][col1 - 1] : 0;

        return total - top - left + topleft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */