/*
 * Problem: Next Permutation
 * Problem ID: 31
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44.7 MB
 * Synced From: LeetCode
 * Date: 2026-08-23
 */

class Solution {
    public void nextPermutation(int[] nums) {
        int l = nums.length;
        int breakpt = -1;
        for(int i = l-2; i >= 0; i--){
            if(nums[i]< nums[i+1]){
                breakpt = i;
                break;
            }
        }
        if(breakpt == -1){
            reverse(0, l-1, nums);
            return;
        }
        for(int j = l-1; j > breakpt; j--){
            if(nums[breakpt] < nums[j]){
                int temp = nums[breakpt];
                nums[breakpt] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        reverse(breakpt + 1, l-1, nums);

    }
    public void reverse(int start, int end, int[] nums){
        int i = start;
        int j = end;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}