package com.scorpion.SwordOffer;

public class ReverseNode {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        ListNode headReverse = null;
        ListNode node = head;
        ListNode pre = null;
        while (node!=null){
            ListNode next = node.next;
            if (next == null)
                headReverse=node;
            node.next = pre;
            pre = node;
            node = next;
        }
        return headReverse;
    }

}
