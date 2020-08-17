package com.scorpion.leetcode;

import java.util.Arrays;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int even_index = 0;
        int odd_index = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0)
                result[even_index++] = A[i];
            else
                result[odd_index--] = A[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 2, 6, 7, 10};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
    }

}
