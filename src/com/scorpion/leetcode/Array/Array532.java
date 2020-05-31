package com.scorpion.leetcode.Array;

import java.util.*;

public class Array532 {

    public int findPairs(int[] nums, int k) {
        if (k < 0){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            if (set.contains((a - k)))
                list.add((a-k));
            if (set.contains((a + k)))
                list.add(a);
            set.add(a);
        }
        return list.size();
    }

}
