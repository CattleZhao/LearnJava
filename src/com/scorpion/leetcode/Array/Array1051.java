package com.scorpion.leetcode.Array;


import java.util.Arrays;

public class Array1051 {

    public int heightChecker(int[] heights) {
        int count = 0;
        int[] a = heights.clone();
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != a[i]) {
                count++;
            }
        }
        return count;
    }

    public int heightChecker2(int[] heights) {
        int count = 0;
        int[] arr = new int[101];
        //计算每个数出现的次数，相当于排好序了
        for (int a : heights) {
            arr[a]++;
        }
        for (int i = 0, j = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                if (heights[j++] != i) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Array1051 array1051 = new Array1051();
        int[] A = {1, 1, 4, 2, 1, 3};
        array1051.heightChecker(A);
    }


}
