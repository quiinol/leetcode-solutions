/*
 * Problem: Roman to Integer
 * Problem ID: 13
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 47.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-20
 */

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> f = new HashMap<>();
        f.put('I', 1);
        f.put('V', 5);
        f.put('X', 10);
        f.put('L', 50);
        f.put('C', 100);
        f.put('D', 500);
        f.put('M', 1000);
        int result = f.get(s.charAt(s.length() - 1));
        for(int i = s.length() - 2; i >= 0; i--){
            if(f.get(s.charAt(i)) >= f.get(s.charAt(i + 1))){
                result = result + f.get(s.charAt(i));
            }
            else{
                result = result - f.get(s.charAt(i));
            }
        }
        return result;
    }
}