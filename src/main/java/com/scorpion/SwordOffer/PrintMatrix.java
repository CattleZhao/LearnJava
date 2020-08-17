package com.scorpion.SwordOffer;

import java.util.ArrayList;

public class PrintMatrix {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int start = 0;
        int columns = matrix[0].length;
        int rows = matrix.length;
        ArrayList<Integer> list = new ArrayList<>();
        while (columns > 2 * start && rows > 2 * start) {
            int endX = columns - 1 - start;
            int endY = rows - 1 - start;

            for (int i = start; i <= endX; i++) {
                list.add(matrix[start][i]);
            }
            if (start < endY) {
                for (int i = start + 1; i <= endY; i++)
                    list.add(matrix[i][endX]);
            }
            if (start < endX && start < endY) {
                for (int i = endX - 1; i >= start; i--)
                    list.add(matrix[endY][i]);
            }
            if (start < endX && start < endY - 1) {
                for (int i = endY - 1; i >= start + 1; i--)
                    list.add(matrix[i][start]);
            }
            start++;

        }
        return list;

    }


}
