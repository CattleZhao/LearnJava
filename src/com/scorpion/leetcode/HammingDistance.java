package com.scorpion.leetcode;

public class HammingDistance {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance(1,2));
    }

}
