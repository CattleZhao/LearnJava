package com.scorpion.leetcode.Array;

public class Array1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int length = 0;
        for (int i = 1; i < points.length; i++) {
            length += Math.max(Math.abs(points[i][0] - points[i - 1][0]), Math.abs(points[i][1] - points[i - 1][1]));
        }
        return length;
    }

    public static void main(String[] args) {
        Array1266 array1266 = new Array1266();
        int[][] a = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(array1266.minTimeToVisitAllPoints(a));
    }

}
