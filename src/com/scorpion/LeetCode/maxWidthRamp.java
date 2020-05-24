package com.scorpion.LeetCode;


import java.util.Stack;

public class maxWidthRamp {

    public int maxWidthRamp(int[] A) {
        int maxWidth = 0;
        int mayWidth = 0;
        for (int i = 0; i < A.length; i++) {
            mayWidth = A.length-1-i;
            if (maxWidth>=mayWidth)
                break;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] <= A[j]) {
                    maxWidth = maxWidth >= (j - i) ? maxWidth : j - i;//计算最大宽度
                }
            }
        }
        return maxWidth;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

}
