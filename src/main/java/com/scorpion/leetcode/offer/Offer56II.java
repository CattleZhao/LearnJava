package com.scorpion.leetcode.offer;

public class Offer56II {
    public static int singleNumber(int[] nums) {
        int[] count = new int[32];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                count[j] += nums[i] & 1;
                nums[i] >>>= 1;
            }
        }
        for (int i = 0; i < 32; i++) {
            count[i] %= 3;
        }
        int res = 0;
        for (int i = 31; i >=0 ; i--) {
            res <<= 1;
            res += count[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,4,4,7};

        System.out.println(Offer56II.singleNumber(nums));
    }
}
