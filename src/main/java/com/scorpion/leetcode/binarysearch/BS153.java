package com.scorpion.leetcode.binarysearch;

public class BS153 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int target = nums[right];
        while (left < right){
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            }else if (nums[mid] > target){
                right = mid;
            }
        }
        return nums[left];
    }
}
