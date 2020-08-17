package com.scorpion.leetcode;

import java.util.Arrays;

public class Sort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) min_index = j;
            }
            // exchange
            int tmp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int length = arr.length;
        int current, preIndex;
        for (int i = 1; i < length; i++) {
            current = arr[i];
            preIndex = i - 1;
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
    }

    public static void shellSort(int[] arr) {
        int gap = arr.length / 2;
        int length = arr.length;
        while (gap >= 1) {
            int current, preIndex;
            for (int i = gap; i < length; i++) {
                current = arr[i];
                preIndex = i - gap;
                while (preIndex >= 0 && arr[preIndex] > current) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = current;
            }
            gap = gap / 2;
        }
    }

    private static int[] res;

    public static void mergeSort(int[] arr) {
        res = new int[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int index = mid + 1;
        int third = left;
        int tmp = left;
        while (left <= mid && index <= right) {
            if (arr[left] <= arr[index]) {
                res[third++] = arr[left++];
            } else {
                res[third++] = arr[index++];
            }
        }
        while (left <= mid) {
            res[third++] = arr[left++];
        }
        while (index <= right) {
            res[third++] = arr[index++];
        }
        while (tmp <= right) {
            arr[tmp] = res[tmp++];
        }
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (arr == null || start >= end || arr.length <= 1)
            return;
        int partition = qSDivide(arr, start, end);
        quickSort(arr, 0, partition);
        quickSort(arr, partition + 1, end);
    }

    private static int qSDivide(int[] arr, int left, int right) {
        int temp = arr[left];
        while (right > left) {
            // 先判断基准数和后面的数依次比较
            while (temp <= arr[right] && left < right) {
                --right;
            }
            // 当基准数大于了 arr[right]，则填坑
            if (left < right) {
                arr[left] = arr[right];
                ++left;
            }
            // 现在是 arr[right] 需要填坑了
            while (temp >= arr[left] && left < right) {
                ++left;
            }
            if (left < right) {
                arr[right] = arr[left];
                --right;
            }
        }
        arr[left] = temp;
        return left;
    }

    public static void HeapSort(int[] arr) {
        int length = arr.length;
        for (int i = length / 2; i >= 0; i--) {
            adjustMaxHeap(arr, i, length);
        }
        //建立完大顶堆之后，将堆顶和最后元素进行交换，调整接下来的元素为大顶堆
        for (int i = length -1; i >= 0; i--) {
            swap(arr, 0, i);
            adjustMaxHeap(arr, 0 , i);
        }
    }

    //从第一个非叶子结点开始，每次调整的都是非叶子结点
    private static void adjustMaxHeap(int[] arr, int i, int length) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int large = 0; // 用来存储当前结点、左孩子、右孩子三个当中最大的结点的index
        if (left < length && arr[left] > arr[i])
            large = left;
        else
            large = i;
        if (right < length && arr[right] > arr[large])
            large = right;
        if (i != large){ // 当前结点不是最大的结点
            //当前结点与最大的交换，然后继续调整
            swap(arr, i, large);
            adjustMaxHeap(arr, large, length);
        }
    }
    
    private static void swap(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 0, 8, 9, 5};
        Sort.HeapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
