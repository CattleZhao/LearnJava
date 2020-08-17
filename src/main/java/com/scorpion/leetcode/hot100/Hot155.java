package com.scorpion.leetcode.hot100;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Hot155 {

    Deque<Integer> stack;
    Deque<Integer> stack_min;

    public Hot155() {
        stack = new ArrayDeque<Integer>();
        stack_min = new ArrayDeque<>();
        stack_min.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        stack_min.push(Math.min(x, stack_min.peek()));
    }

    public void pop() {
        stack.pop();
        stack_min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack_min.peek();
    }

    public static void main(String[] args) {
        Hot155 hot155 = new Hot155();
        hot155.push(2);
        hot155.push(0);
        hot155.push(3);
        hot155.push(0);
        hot155.getMin();
        hot155.pop();
        hot155.getMin();
        hot155.pop();
        hot155.getMin();
        hot155.pop();
        hot155.getMin();
    }

}
