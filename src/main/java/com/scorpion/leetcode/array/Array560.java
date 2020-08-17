package com.scorpion.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class Array560 {

    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        int sum0_i = 0;
        for (int i = 0; i < nums.length; i++) {
            sum0_i += nums[i];
            int sum0_j = sum0_i - k;
            if (map.containsKey(sum0_j)){
                ans+=map.get(sum0_j);
            }
            map.put(sum0_i, map.getOrDefault(sum0_i, 0) + 1);
        }
        return ans;
    }

}
