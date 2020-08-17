package com.scorpion.SwordOffer;

import java.util.Stack;

public class stackPopPush {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        boolean isPossible = false;
        if (pushA.length == 0 || popA.length == 0) {
            isPossible = false;
        }
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                index++;
                stack.pop();
            }
        }
        if (stack.isEmpty() && index == popA.length - 1)
            isPossible = true;
        else
            isPossible = false;
        return isPossible;

    }

}
