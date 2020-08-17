package com.scorpion.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Array118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0)
            return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> preList = res.get(i - 1);
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(preList.get(j-1) + preList.get(j));
            }

            list.add(1);
            res.add(list);

        }

        return res;
    }

}
