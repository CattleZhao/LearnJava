package com.scorpion.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LT435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int length = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int count = 1;
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] > end){
                count ++;
                end = intervals[i][1];
            }
        }
        return length-count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
        LT435 lt435 = new LT435();
        System.out.println(lt435.eraseOverlapIntervals(intervals));
    }
}
