package com.scorpion.leetcode.binarysearch;

public class BS74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midNum = matrix[mid / n][mid % n];
            if (midNum < target) {
                left = mid + 1;
            } else if (midNum > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
