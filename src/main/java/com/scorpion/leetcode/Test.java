package com.scorpion.leetcode;

public class Test {
    public static void main(String[] args) {
        int num = 0;
        long start = System.currentTimeMillis() / 1000;
        while (true) {
            num = num + 1;
            if (num == Integer.MAX_VALUE) {
                System.out.println("reset");
                num = 0;
            }
            if ((System.currentTimeMillis() / 1000) - start > 1000) {
                return;
            }
        }
    }
}
