package com.scorpion.leetcode.binarysearch;

public class BS704 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right){
            int mid = (left + right) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            }else if (nums[mid] > target){
                right = mid;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BS704 bs704 = new BS704();
        int[] a = new int[]{-1,0,3,5,9,12};
        System.out.println(bs704.search(a, 2));
    }
}
