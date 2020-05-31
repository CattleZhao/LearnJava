package com.scorpion.leetcode.Array;

public class Array1013 {

    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i : A){
            sum += i;
        }
        if(sum%3 != 0){
            return false;
        }
        sum = 0;
        int target = sum / 3;
        int cursor = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum == target){
                cursor = i;
                break;
            }
        }
        if (sum != target){
            return false;
        }
        int j = cursor+1;
        while (j < (A.length-1)){
            sum += A[j];
            if (sum == target * 2)
                return true;
            j += 1;
        }
        return false;

    }

}
