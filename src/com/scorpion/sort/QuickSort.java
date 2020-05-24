package com.scorpion.sort;

import java.util.Arrays;

public class QuickSort {
    public static int[] a = {1, 4, 7, 2, 1, 10, 8};

    public static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
    }

    public static int partition(int[] A, int p, int r) {
        int x = A[p];
        while (p < r) {
            while (p < r && A[r] >= x) --r;
            A[p] = A[r];
            while (p < r && A[p] <= x) ++p;
            A[r] = A[p];
        }
        A[p] = x;
        return p;
    }

    public static void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    public static void main(String[] args) {
        quickSort(a, 0, 6);
        System.out.println(Arrays.toString(a));
    }
}
