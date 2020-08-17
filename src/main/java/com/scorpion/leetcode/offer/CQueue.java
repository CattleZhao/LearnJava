package com.scorpion.leetcode.offer;

import java.util.ArrayDeque;
import java.util.Deque;

class CQueue {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public CQueue() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        if (stack1.isEmpty())
            return -1;
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}