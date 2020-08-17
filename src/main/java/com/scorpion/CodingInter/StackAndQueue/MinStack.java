package com.scorpion.CodingInter.StackAndQueue;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (newNum < this.stackMin.peek()) {
            this.stackMin.push(newNum);
        } else {
            int newMin = this.stackMin.peek();
            this.stackMin.push(newMin);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        this.stackMin.pop();
        return this.stackData.pop();
    }

    public int getMin() {
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.getMin());
    }
}
