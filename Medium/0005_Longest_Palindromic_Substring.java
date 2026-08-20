/*
 * Problem: Longest Palindromic Substring
 * Problem ID: 5
 * Difficulty: Medium
 * Language: Java
 * Runtime: 17 ms
 * Memory: 43.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-20
 */

class Solution {
    public String longestPalindrome(String s) {
        int len = 0;
        int l = 0; int start = 0;
        int r = 0; int end = 0;
        //odd:
        for(int i = 0; i < s.length(); i++){
            l = i; r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if((r - l + 1) > len){
                    len = r - l + 1;
                    start = l;
                    end = r;
                }
                l--;
                r++;
            }
        }
        //even:
        for(int i = 0; i < s.length(); i++){
            l = i; r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if((r - l + 1) > len){
                    len = r - l + 1;
                    start = l;
                    end = r;
                }
                l--;
                r++;
            }
        }
        return s.substring(start, end + 1);
    }
}