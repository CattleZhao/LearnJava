package com.scorpion.leetcode.binarysearch;

import java.util.Arrays;

public class BS34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int left = 0, right = nums.length;
        while (left < right){
            int mid  = (left + right) / 2;
            if (nums[mid] == target){
                right = mid;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        if (left < nums.length && nums[left] == target)
            res[0] = left;
        left = 0;
        right = nums.length;
        while (left < right){
            int mid  = (left + right) / 2;
            if (nums[mid] == target){
                left = mid+1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        if (left != 0 && nums[left - 1] == target)
            res[1] = left - 1;
        return res;
    }

    public static void main(String[] args) {
        BS34 bs34 = new BS34();
        int[] a = new int[]{5,7,7,8,8,10};
        System.out.println(Arrays.toString(bs34.searchRange(a, 8)));
    }
}
