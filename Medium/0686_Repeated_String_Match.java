/*
 * Problem: Repeated String Match
 * Problem ID: 686
 * Difficulty: Medium
 * Language: Java
 * Runtime: 265 ms
 * Memory: 43.9 MB
 * Synced From: LeetCode
 * Date: 2026-08-21
 */

class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder temp = new StringBuilder();
        int count = 0;
        while(temp.length() < b.length()){
            temp.append(a);
            count++;
        }
        if(temp.toString().contains(b)){
            return count;
        }
        else{
            temp.append(a);
            count++;
            if(temp.toString().contains(b)){
                return count;
            }
        }
        return -1;
    }
}