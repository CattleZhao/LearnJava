package com.scorpion.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * <p>
 * Example:
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * <p>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 */

public class RangeSumQuery {
    int[] rangeSum;

    public RangeSumQuery(int[] nums) {
        rangeSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            rangeSum[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? rangeSum[j] : rangeSum[j] - rangeSum[i - 1];
    }
}
