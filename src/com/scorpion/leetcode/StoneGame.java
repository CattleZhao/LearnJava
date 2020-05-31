package com.scorpion.leetcode;

public class StoneGame {
    public boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length][piles.length];
        for (int i = 0; i < piles.length; i++) {
            dp[i][i] = piles[i];
        }
        for (int i = 1; i < piles.length; i++) {
            for (int j = 0; j < piles.length-i; j++) {
                dp[j][j+i] = Math.max(piles[j]-dp[j+1][j+i], piles[j+i]-dp[j][j+i-1]);
            }
        }
        return dp[0][piles.length-1]>0;
    }
}
