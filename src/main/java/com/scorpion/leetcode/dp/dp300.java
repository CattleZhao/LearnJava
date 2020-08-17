package com.scorpion.leetcode.dp;

import java.util.Arrays;

public class dp300 {
    // O(N*N)
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(dp[i], res);
        }
        return res;

    }

    // O(lgN)
    public int lengthOfLIS2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = 0;
        int[] top = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int poker = nums[i];
            // 搜索左侧的二分查找
            int left = 0, right = res;
            while (left < right) {
                int mid = (left + right) / 2;
                if (top[mid] < poker) {
                    left = mid + 1;
                } else if (top[mid] > poker) {
                    right = mid;
                } else if (top[mid] == poker) {
                    //减小搜索空间来找最左侧边界
                    right = mid;
                }
            }
            if (left == res) res++;
            top[left] = poker;
            System.out.println(Arrays.toString(top));

        }
        return res;
    }

    public static void main(String[] args) {
        dp300 dp = new dp300();
        int[] a = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(dp.lengthOfLIS2(a));
    }
}
