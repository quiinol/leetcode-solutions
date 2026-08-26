/*
 * Problem: Rotate Image
 * Problem ID: 48
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.9 MB
 * Synced From: LeetCode
 * Date: 2026-08-26
 */

class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length - 1; i++){
            for(int j = i + 1; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            int f =  0;
            int l = matrix.length - 1;
            while(f < l){
                int temp = matrix[i][f];
                matrix[i][f] = matrix[i][l];
                matrix[i][l] = temp;
                f++;
                l--;
            }
        }
    }
}