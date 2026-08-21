/*
 * Problem: String to Integer (atoi)
 * Problem ID: 8
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43.8 MB
 * Synced From: LeetCode
 * Date: 2026-08-21
 */

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        long result = 0;
        int i = 0;
        int sign = 1;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if (s.charAt(i) == '+') {
            i++;
        }
        while(i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                result = (result * 10) + (s.charAt(i) - '0');
            }
            else{
                break;
            }

            if(result * sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(result * sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            i++;
        }
        return (int) (result * sign);
    }
}