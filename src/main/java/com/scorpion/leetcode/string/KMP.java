package com.scorpion.leetcode.string;

public class KMP {
    private int[][] dp;

    public KMP(String pattern) {
        int length = pattern.length();
        dp = new int[length][256];
        dp[0][pattern.charAt(0)] = 1;
        int X = 0;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < 256; j++) {
                if (pattern.charAt(i) == j)
                    dp[i][j] = i + 1;
                else
                    dp[i][j] = dp[X][j];
            }
            X = dp[X][pattern.charAt(i)];

        }
    }

    public int search(String txt, String pattern) {
        int M = txt.length();
        int N = pattern.length();
        for (int i = 0, j = 0; i < M && j < N; i++) {
            j = dp[j][txt.charAt(i)];
            if(j == N) return i - N + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        KMP kmp = new KMP("bba");
        System.out.println(kmp.search("aaaaa", "bba"));
    }
}
