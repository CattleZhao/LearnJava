package com.scorpion.LeetCode.Array;

import java.util.ArrayList;
import java.util.List;

public class Array1018 {
    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>();
        int base = 0;
        for (int i = 0; i < A.length; i++) {
            base = A[i]+ base * 2;
            if (base % 5 == 0){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }

}
