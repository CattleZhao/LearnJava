package com.scorpion.leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] step = new int[n + 1];
        step[0] = 1;
        step[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            step[i] = step[i-1]+step[i-2];
        }
        return step[n];
    }
}
