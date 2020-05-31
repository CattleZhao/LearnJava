package com.scorpion.leetcode;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i])
                minPrice = prices[i];
            else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }

}
