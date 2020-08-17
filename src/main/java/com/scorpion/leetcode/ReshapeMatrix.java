package com.scorpion.leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int columns = nums[0].length;
        int[][] result = new int[r][c];
        if (rows*columns!=r*c) return nums;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ((LinkedList<Integer>) queue).add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = queue.poll();
            }
        }
        return result;
    }

}
