package com.scorpion.SwordOffer;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseList {
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if (listNode != null) {
            if (listNode.next != null) {
                printListFromTailToHead(listNode.next);
            }
            list.add(listNode.val);
        }
        return list;
    }
}
