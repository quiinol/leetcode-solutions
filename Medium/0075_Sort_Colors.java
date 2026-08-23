/*
 * Problem: Sort Colors
 * Problem ID: 75
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.6 MB
 * Synced From: LeetCode
 * Date: 2026-08-23
 */

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}