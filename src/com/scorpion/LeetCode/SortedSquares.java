package com.scorpion.LeetCode;

import java.util.Arrays;

public class SortedSquares {

    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int start = 0;
        int end = A.length - 1;
        int index = A.length - 1;
        while (start <= end) {
            if (Math.abs(A[start]) < Math.abs(A[end])) {
                result[index--] = A[end] * A[end];
                end--;
            } else {
                result[index--] = A[start] * A[start];
                start++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SortedSquares sortedSquares = new SortedSquares();
        int[] A = new int[]{-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares.sortedSquares(A)));
    }

}
