package com.scorpion.LeetCode.NowCoder;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
public class SortList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode pre = null;
        ListNode slow = head, fast = head;
        while (fast!= null && fast.next!= null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1, l2);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode l = temp;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l.next = l1;
                l1 = l1.next;
            } else {
                l.next = l2;
                l2 = l2.next;
            }
            l = l.next;
        }
        while (l1 != null) {
            l.next = l1;
            l1 = l1.next;
            l = l.next;
        }
        while (l2 != null) {
            l.next = l2;
            l2 = l2.next;
            l = l.next;
        }
        return temp.next;
    }
}
