package com.scorpion.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            sumA+= A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sumB+=B[i];
            setB.add(B[i]);
        }
        int temp = (sumA-sumB)/2;
        for (int i = 0;i<A.length;i++){
            if (setB.contains(A[i]-temp))
                return new int[]{A[i], A[i]-temp};
        }
        return null;
    }

}
