package com.scorpion.LeetCode.Array;

import java.util.Arrays;

public class Array66 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            digits[i] ++;
            digits[i]  = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        Array66 array66 = new Array66();
        int[] a = {9,9,9};
        System.out.println(Arrays.toString(array66.plusOne(a)));
    }

}
