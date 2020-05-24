package com.scorpion.LeetCode;

public class FlippingImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int rows = A.length;
        int columns = A[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            int column = 0;
            for (int j = columns - 1; j >= 0; j--) {
                result[i][column++] = A[i][j]^1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 0;
        System.out.println(a^1);
    }

}
