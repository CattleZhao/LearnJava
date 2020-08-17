package com.scorpion.leetcode.list;



import com.scorpion.leetcode.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class List445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println();Math.pow(10, 2);
        Deque<ListNode> stack1 = new ArrayDeque<ListNode>();
        Deque<ListNode> stack2 = new ArrayDeque<ListNode>();
        int length1 = 0, length2 = 0;
        ListNode node1 = l1, node2 = l2;
        int carry = 0;
        while (node1 != null || node2 != null) {
            if (node1 != null) {
                stack1.push(node1);
                node1 = node1.next;
                length1++;
            }
            if (node2 != null) {
                stack2.push(node2);
                node2 = node2.next;
                length2++;
            }
        }
        if (length1 > length2) {
            while (!stack1.isEmpty()) {
                ListNode node = stack1.pop();
                int sum = node.val + (stack2.isEmpty() ? 0 : stack2.pop().val) + carry;
                carry = sum / 10;
                node.val = sum % 10;
            }
            if (carry == 1){
                ListNode newNode = new ListNode(1);
                newNode.next = l1;
                return newNode;
            }else {
                return l1;
            }
        } else {
            while (!stack2.isEmpty()) {
                ListNode node = stack2.pop();
                int sum = node.val + (stack1.isEmpty() ? 0 : stack1.pop().val) + carry;
                carry = sum / 10;
                node.val = sum % 10;
            }
            if (carry == 1){
                ListNode newNode = new ListNode(1);
                newNode.next = l2;
                return newNode;
            }else {
                return l2;
            }
        }


    }

    public static void main(String[] args) {
        System.out.println(Math.pow(10, 2));
    }
}
