package com.scorpion.leetcode.array;

public class Array1351 {

    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               if (grid[i][j] < 0){
                   count += n - j;
                   break;
               }
            }
        }
        return count;
    }

}
