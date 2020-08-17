package com.scorpion.leetcode;


import java.util.ArrayList;
import java.util.List;

public class Candy1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max_candy = candies[0];
        for (int candy : candies) {
            max_candy = Math.max(max_candy, candy);
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max_candy)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }

}
