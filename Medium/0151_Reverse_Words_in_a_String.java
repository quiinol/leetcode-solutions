/*
 * Problem: Reverse Words in a String
 * Problem ID: 151
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms
 * Memory: 44.4 MB
 * Synced From: LeetCode
 * Date: 2026-08-20
 */

class Solution {
    public String reverseWords(String s) {
        String[] a  = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = a.length - 1; i >= 0; i--){
            sb.append(a[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}