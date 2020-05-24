package com.scorpion.LeetCode;

public class SortArrayParityII {

    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int even_index = 0;
        int odd_index = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[even_index] = A[i];
                even_index += 2;
            } else {
                result[odd_index] = A[i];
                odd_index += 2;
            }

        }
        return result;
    }

}
