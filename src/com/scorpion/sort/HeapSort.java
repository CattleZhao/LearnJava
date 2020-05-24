package com.scorpion.sort;

public class HeapSort {

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2; i >= 0; i--)
            heapAdjust(arr, i, arr.length);

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i); // 将堆顶记录和当前未经排序子序列的最后一个记录交换
            heapAdjust(arr, 0, i); // 交换之后，需要重新检查堆是否符合大顶堆，不符合则要调整
        }

    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }


    public static void heapAdjust(int[] arr, int k, int len) {
        int father = arr[k];
        for (int i = 2 * k; i < len; i *= 2) {
            if (i != len - 1 && arr[i] < arr[i + 1])
                i++;
            if (father >= arr[i]) break;
            else {
                arr[k] = arr[i];
                k = i;
            }
        }
        arr[k] = father;
    }

    public static void main(String[] args) {
        int[] arr = {50, 10, 90, 30, 70, 40, 80, 60, 20};
        System.out.println("排序之前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 堆排序
        heapSort(arr);

        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
