package com.scorpion.SwordOffer;

public class FindKthToTail {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode first = head;
        ListNode second = null;
        while (first != null && k > 0) {
            first = first.next;
            k--;
        }
        second = head;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

}
