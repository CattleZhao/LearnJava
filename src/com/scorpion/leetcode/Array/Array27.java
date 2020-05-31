package com.scorpion.leetcode.Array;

public class Array27 {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val){
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}