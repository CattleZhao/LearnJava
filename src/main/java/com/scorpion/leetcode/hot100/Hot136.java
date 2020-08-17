package com.scorpion.leetcode.hot100;

public class Hot136 {

    /**
     * 任何数和 0 做异或运算，结果仍然是原来的数，即 a ^ 0 = a。
     * 任何数和其自身做异或运算，结果是 a ^ a = 0;
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }

}
