package com.scorpion.PDD2;

import java.util.Scanner;

public class A {

    public static void getMaxOneLines(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns - 1;
        int maxOne = 0;
        while (row < rows && column >= 0) {
            if (matrix[row][column] == 1) {
                column--;
                maxOne++;
            } else {
                row++;
            }
        }
        for (int i = 0; i < rows; i++) {
            if (matrix[i][columns-maxOne]==1)
                System.out.println("["+(i+1)+","+maxOne+"]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        getMaxOneLines(matrix);
    }

}
