package com.scorpion.sort;

import java.util.Arrays;

public class insert_sort {
    public static int[] insert_sort(int[] nums) {
        for (int j = 1; j < nums.length; j++) {
            int key = nums[j];
            int i = j - 1;
            while (i >= 0 && nums[i] > key) {
                nums[i + 1] = nums[i];
                i--;
            }
            nums[i + 1] = key;
        }
        return nums;
    }

    public static int[] shell_sort(int[] nums) {
        int temp;
        int step = nums.length;
        while (true) {
            step = step / 2;
            for (int i = 0; i < step; i++) {
                for (int j = i + step; j < nums.length; j += step) {
                    temp = nums[j];
                    int k = j - step;
                    while (k >= 0 && nums[k] > temp) {
                        nums[k + step] = nums[k];
                        k -= step;
                    }
                    nums[k + step] = temp;
                }
            }
            if (step == 1)
                break;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array = {10, 1, 2, 9, 3, 15, 3, 7};
        shell_sort(array);
        System.out.println(Arrays.toString(array));
    }
}
