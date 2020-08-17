package com.scorpion.CodingInter.StackAndQueue;

import java.util.Arrays;
import java.util.LinkedList;

public class getMaxWindow {

    public static int[] getMaxwindow(int[] arr, int w) {
        if (arr == null | w < 1 || arr.length < w)
            return null;
        LinkedList<Integer> qmax = new LinkedList<>();
        int[] res = new int[arr.length - w + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i])
                qmax.pollLast();
            qmax.addLast(i);
            if (qmax.peekLast() == i - w)
                qmax.pollLast();
            if (i >= w - 1)
                res[index++] = arr[qmax.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 5, 4, 3, 3, 6, 7};
        System.out.println(Arrays.toString(getMaxwindow(arr, 3)));
    }
}
