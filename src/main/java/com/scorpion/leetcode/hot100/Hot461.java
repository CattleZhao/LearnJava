package com.scorpion.leetcode.hot100;

public class Hot461 {

    public int hammingDistance(int x, int y) {
        int count = 0;
        int i = x ^ y;
        while (i != 0){
            if ((i&1)==1)
                count++;
            i  = i >>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Hot461 hot461 = new Hot461();
        System.out.println(hot461.hammingDistance(1, 4));
    }

}
