package com.scorpion.sort;

import java.util.Arrays;

public class merge_sort {

    public static int[] merge_sort(int[] nums, int low, int high) {
        int mid = (high + low) / 2;
        if (low < high) {
            merge_sort(nums, low, mid);
            merge_sort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
        return nums;

    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        //覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[low + k2] = temp[k2];
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 9, 3, 15, 3, 7};
        merge_sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
