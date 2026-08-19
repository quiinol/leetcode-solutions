/*
 * Problem: Set Matrix Zeroes
 * Problem ID: 73
 * Difficulty: Medium
 * Language: Java
 * Runtime: 129 ms
 * Memory: 47.7 MB
 * Synced From: LeetCode
 * Date: 2026-08-19
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        int [] row_mat = new int [matrix.length];
        int [] col_mat = new int [matrix[0].length];
        for(int r = 0; r < row_mat.length; r++){
            row_mat[r] = 1;
        }
        for(int c = 0; c < col_mat.length; c++){
            col_mat[c] = 1;
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row_mat[i] = 0;
                    col_mat[j] = 0;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(row_mat[i] == 0 || col_mat[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}