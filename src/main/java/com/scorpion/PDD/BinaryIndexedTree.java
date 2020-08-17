package com.scorpion.PDD;

public class BinaryIndexedTree {

    public int length = 1000;
    public int[] tree = new int[length + 1];

    public void add(int k, int value) {
        while (k < length) {
            tree[k] += value;
            k += k & -k;
        }
    }

    public int sum(int k) {
        int sum = 0;
        while (k > 0) {
            sum += tree[k];
            k -= k & -k;
        }
        return sum;
    }

}
