/*
 * Problem: Merge Sorted Array
 * Problem ID: 88
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 44.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-26
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i = 0, j = m; i < n; i++){
            nums1[j] = nums2[i];
            j++;
       }
       Arrays.sort(nums1);
    }
}