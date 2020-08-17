package com.scorpion.SwordOffer;

public class Path {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] visit = new boolean[rows * cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPath(matrix, rows, cols, i, j, str, 0, visit))
                    return true;
            }
        }
        return false;
    }


    public boolean hasPath(char[] matrix, int rows, int cols, int row, int col, char[] str, int curr, boolean[] visit) {
        boolean hasPath = false;
        int index = row * cols + col;
        if (curr == str.length-1)
            return true;

        if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[index] == str[curr] && !visit[index]) {
            curr++;
            visit[index] = true;
            hasPath = hasPath(matrix, rows, cols, row - 1, col, str, curr, visit) ||
                    hasPath(matrix, rows, cols, row + 1, col, str, curr, visit) ||
                    hasPath(matrix, rows, cols, row, col - 1, str, curr, visit) ||
                    hasPath(matrix, rows, cols, row, col + 1, str, curr, visit);
            if (!hasPath) {
                curr--;
                visit[index] = false;
            }
        }
        return hasPath;
    }

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("abc");
        System.out.println(s1==s2);
    }

}
