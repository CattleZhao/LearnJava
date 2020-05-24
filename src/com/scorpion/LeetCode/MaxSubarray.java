package com.scorpion.LeetCode;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum =Math.max(nums[i], nums[i] + sum);
            max = ( sum> max) ? sum : max;
        }
        return max;
    }
}
