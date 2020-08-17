package com.scorpion.leetcode.array;

public class Array674 {

    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int res = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i]) {
                count++;
            } else {
                count = 1;
            }
            res = res > count ? res : count;
        }
        return res;
    }

    public int findLengthOfLCIS2(int[] nums) {
        int ans = 0;
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] >= nums[i]) position = i;
            ans = Math.max(ans, i - position + 1);
        }
        return ans;
    }

}
