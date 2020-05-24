package com.scorpion.LeetCode.Array;

import java.util.Arrays;

public class Array581 {

    public int findUnsortedSubarray(int[] nums) {
        int l = nums.length, r = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    l = Math.min(l, i);
                    r = Math.max(r, j);
                }
            }
        }
        return r - l < 0 ? 0 : r - l + 1;
    }

    public int findUnsortedSubarray2(int[] nums) {
        int l = nums.length, r = 0;
        int[] snum = nums.clone();
        Arrays.sort(snum);
        for (int i = 0; i < snum.length; i++) {
            if (snum[i] != nums[i]){
                l = Math.min(i, l);
                r = Math.max(i, r);
            }
        }
        return r - l < 0 ? 0 : r - l + 1;
    }

}
