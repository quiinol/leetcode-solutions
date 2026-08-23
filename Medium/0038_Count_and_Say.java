/*
 * Problem: Count and Say
 * Problem ID: 38
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 42.9 MB
 * Synced From: LeetCode
 * Date: 2026-08-23
 */

class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1"; 
        }
        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int count = 1;
            while(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return sb.toString();
    }
}