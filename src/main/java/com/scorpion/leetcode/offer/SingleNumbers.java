package com.scorpion.leetcode.offer;

public class SingleNumbers {
    public static void singleNumbers(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            k ^= nums[i];
        }
        int mask = 1;
        while((k & mask) == 0) {
            mask <<= 1;
        }

        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & mask) == 0){
                a ^= nums[i];
            }else {
                b ^= nums[i];
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {
                2, 4, 3, 6, 3, 2, 5, 5
        };
        SingleNumbers.singleNumbers(nums);
    }
}
