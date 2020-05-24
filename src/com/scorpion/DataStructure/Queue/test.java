package com.scorpion.DataStructure.Queue;


import java.util.Scanner;

import static java.lang.Math.max;

public class test {

    public static int steal (int[] a){
        int pprev = 0, prev = 0, cur = 0;
        for(int i = 0; i < a.length; ++i)
        {
            cur = max(a[i] + pprev, prev);
            pprev = prev;
            prev =  cur;
        }
        return cur;
    }

    public static void main(String[] args) {

        int minCount = Integer.MIN_VALUE;
        int index = 51;
        for (int i = 1;i<=5;i++){
            String binary = Integer.toBinaryString(i);
            int count = 0;
            for (int j = binary.length()-1; j >=0 ; j--) {
                if(binary.charAt(j)=='1'){
                    if (count>minCount){
                        minCount = count;
                        index = i;
                    }
                    break;
                }
                count++;
            }
        }
        System.out.println(index);
    }
}
