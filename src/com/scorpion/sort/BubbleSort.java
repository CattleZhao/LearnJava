package com.scorpion.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        boolean flag;
        for (int i = 0; i < nums.length; i++) {
            flag = false;
            for (int j = nums.length-1; j > i; j--) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }
            if (flag == false)
                break;
        }
    }

    public static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
    }

    public static void main(String[] args) {
        int[] array = {10, 1, 2, 9, 3, 15, 3, 7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
