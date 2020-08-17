package com.scorpion.leetcode;

public class MonotonicArray {

    public boolean isMonotonic(int[] A) {
        boolean inc = true;
        boolean des = true;
        for (int i = 1; i < A.length; i++) {
            inc &= A[i]>=A[i-1];
            des &= A[i]<=A[i-1];
        }
        return inc || des;
    }

}
