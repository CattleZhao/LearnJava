package com.scorpion.LeetCode;

public class StrStr {

    public int strStr(String haystack, String needle) {
        if (haystack.length()==0){
            return 0;
        }
        if (needle.length() == 0)
            return 0;
        int[][] dp = new int[needle.length()][256];
        dp[0][needle.charAt(0)] = 1;
        int X = 0;
        for (int i = 1; i < needle.length(); i++) {
            for (int j = 0; j < 256; j++) {
                dp[i][j] = dp[X][j];
            }
            dp[i][needle.charAt(i)] = i + 1;
            X = dp[X][needle.charAt(i)];
        }
        int M = haystack.length();
        int N = needle.length();
        int j =0;
        for (int i = 0; i < M; i++) {
            j = dp[j][haystack.charAt(i)];
            if (j == N) return i - N + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
