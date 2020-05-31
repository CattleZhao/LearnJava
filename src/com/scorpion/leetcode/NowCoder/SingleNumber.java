package com.scorpion.leetcode.NowCoder;

public class SingleNumber {

    public static int singleNumber(int[] A) {
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            res ^= A[i];
            System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] A = new int[]{2, 1};
//        singleNumber(A);
        System.out.println(2^1);
    }

}
