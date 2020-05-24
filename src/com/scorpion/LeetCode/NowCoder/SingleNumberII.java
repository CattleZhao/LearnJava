package com.scorpion.LeetCode.NowCoder;

public class SingleNumberII {
    public static int singleNumberII(int[] A) {
        int one = 0, two = 0, three = 0;
        for (int i = 0; i < A.length; i++) {
            two |= one & A[i];
            one ^= A[i];

            three = one & two;
            two &= ~three;
            one &= ~three;
        }
        return one;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 2, 2};
        System.out.println(singleNumberII(A));
    }
}
