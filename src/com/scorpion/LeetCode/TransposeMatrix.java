package com.scorpion.LeetCode;

public class TransposeMatrix {

    public int[][] transpose(int[][] A) {
        int rows = A.length;
        int columns = A[0].length;
        int[][] result = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = A[j][i];
            }
        }
        return result;
    }

}
