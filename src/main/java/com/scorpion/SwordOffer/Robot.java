package com.scorpion.SwordOffer;

public class Robot {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[] visit = new boolean[rows * cols];
        int count = hasPath(threshold, rows, cols, 0, 0, visit);
        return count;
    }

    public int hasPath(int threshold, int rows, int cols, int row, int col, boolean[] visit) {
        int count = 0;
        if (check(threshold, rows, cols, row, col, visit)) {
            visit[row * cols + col] = true;
            count = 1 + hasPath(threshold, rows, cols, row - 1, col, visit)
                    + hasPath(threshold, rows, cols, row + 1, col, visit)
                    + hasPath(threshold, rows, cols, row, col - 1, visit)
                    + hasPath(threshold, rows, cols, row, col + 1, visit);
        }
        return count;
    }

    public boolean check(int threshold, int rows, int cols, int row, int col, boolean[] visit) {
        if (row < rows && row >= 0 && col < cols && col >= 0 && getDigitSum(row) + getDigitSum(col) <= threshold &&
                visit[row * cols + col] == false) {
            return true;
        }
        return false;
    }

    public int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a<<1);
    }
}
