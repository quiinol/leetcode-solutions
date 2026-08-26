/*
 * Problem: Find the Duplicate Number
 * Problem ID: 287
 * Difficulty: Medium
 * Language: Java
 * Runtime: 4 ms
 * Memory: 83 MB
 * Synced From: LeetCode
 * Date: 2026-08-26
 */

class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer, Integer> h = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     int n = nums[i];
        //     if(h.containsKey(n)){
        //         h.put(n, h.get(n)+1);
        //     }
        //     else{
        //         h.put(n, 1);
        //     }
        // }
        // for(int i = 0; i < nums.length; i++){
        //     int n = nums[i];
        //     if(h.get(n) > 1){
        //         return n;
    //          }
        // }
        // return 0


        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}