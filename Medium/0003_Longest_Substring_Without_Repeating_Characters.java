/*
 * Problem: Longest Substring Without Repeating Characters
 * Problem ID: 3
 * Difficulty: Medium
 * Language: Java
 * Runtime: 37 ms
 * Memory: 48 MB
 * Synced From: LeetCode
 * Date: 2026-08-20
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> f  = new HashMap<>();
        int l = 0; int r = 0; int len = 0;
        while(r < s.length()){
            char ch = s.charAt(r);
            if(f.containsKey(ch)){
                l = Math.max(l, f.get(ch) + 1); 
            }
            f.put(ch, r);
            len = Math.max(len, r - l + 1);
            r++;
        }
        return len;
    }
}