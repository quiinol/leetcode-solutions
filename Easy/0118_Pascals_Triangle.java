/*
 * Problem: Pascal's Triangle
 * Problem ID: 118
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43.6 MB
 * Synced From: LeetCode
 * Date: 2026-08-23
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> f = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            int ans = 1;
            for(int j = 0; j <= i; j++){
                temp.add(ans);
                ans = ans * (i - j);
                ans = ans / (j+1);
            }
            f.add(temp);
        }
        return f;
    }
}