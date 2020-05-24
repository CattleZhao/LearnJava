package com.scorpion.LeetCode.NowCoder;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode fast = head;
        ListNode low = head;
        while (fast.next.next != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
            if (fast == low)
                return true;
        }
        return false;
    }

}
