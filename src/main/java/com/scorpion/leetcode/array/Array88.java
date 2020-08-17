package com.scorpion.leetcode.array;

public class Array88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num1_copy = new int[m];
        System.arraycopy(nums1, 0, num1_copy, 0, m);
        int i = 0, j = 0;
        int p = 0;
        while (i < m && j < n) {
            nums1[p++] = num1_copy[i] < nums2[j] ? num1_copy[i++] : nums2[j++];
        }
        if (i < m) {
            System.arraycopy(num1_copy, i, nums1, i + j, m - i);
        }
        if (j < n) {
            System.arraycopy(nums2, j, nums1, i + j, n - j);
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            nums1[p--] = nums1[i] < nums2[j] ? nums2[j--]: nums1[i--];
        }
        System.arraycopy(nums2, 0, nums1, 0, j + 1);
    }

}
