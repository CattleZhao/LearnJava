package com.scorpion.SwordOffer;

import java.util.Stack;

public class MinStack {
    Stack<Integer> elements;
    Stack<Integer> minStack;

    public void push(int node) {
        elements.push(node);
        if (minStack.isEmpty() || node < minStack.peek()) {
            minStack.push(node);
        }
    }

    public void pop() {
        if (elements.isEmpty()) return;
        if (elements.peek() == minStack.peek()) {
            minStack.pop();
        }
        elements.pop();
    }

    public int top() {
        return elements.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
