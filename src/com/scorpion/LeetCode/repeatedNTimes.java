package com.scorpion.LeetCode;

public class repeatedNTimes {

    public static int repeatedNTime(int[] A) {
        int[] index = new int[10000];
        for (int i = 0; i < A.length; i++) {
            index[A[i]] += 1;
        }
        int count = 0;
        for (int i = 0; i < index.length; i++) {
            if (index[i]>1)
                count = i;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,3};
        System.out.println(repeatedNTime(A));
    }

}
