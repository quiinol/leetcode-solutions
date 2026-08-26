/*
 * Problem: Merge Intervals
 * Problem ID: 56
 * Difficulty: Medium
 * Language: Java
 * Runtime: 8 ms
 * Memory: 49.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-26
 */

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        int[] cur = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= cur[1]){
                //overlap
                cur[1] = Math.max(cur[1], intervals[i][1]);
            }
            else{ //no overlap
                ans.add(cur);
                cur = intervals[i];
            }
        }
        ans.add(cur);  
        return ans.toArray(new int[ans.size()][]);
    }
}