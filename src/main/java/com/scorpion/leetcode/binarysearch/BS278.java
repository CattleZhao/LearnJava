package com.scorpion.leetcode.binarysearch;

public class BS278 {
    boolean isBadVersion(int version){return true;}
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right){
            int mid  = left + (right - left) / 2;
            if (isBadVersion(mid) == true){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
