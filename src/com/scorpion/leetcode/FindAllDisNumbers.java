package com.scorpion.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisNumbers {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i] > 0 ? nums[i] : -nums[i];
            index-=1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                list.add(i + 1);
        }
        return list;
    }

}
