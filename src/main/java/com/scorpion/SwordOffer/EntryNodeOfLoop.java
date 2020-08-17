package com.scorpion.SwordOffer;

public class EntryNodeOfLoop {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode head) {
        if (head==null)
            return null;
        ListNode meetNode = meetingNode(head);
        if (meetNode==null) return null;

        int loopCount = 1;//环的长度
        ListNode tempNode = meetNode;
        while (tempNode.next!= meetNode){
            tempNode = tempNode.next;
            loopCount++;
        }

        tempNode = head;
        for (int i = 0; i < loopCount; i++) {
            tempNode = tempNode.next;
        }
        ListNode tempNode2 = head;
        while (tempNode!=tempNode2){
            tempNode = tempNode.next;
            tempNode2 = tempNode2.next;
        }
        return tempNode;
    }

    private ListNode meetingNode(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head.next;
        if (slow == null)
            return null;
        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if (slow == fast)
                return fast;
            slow = slow.next;
            fast = fast.next;
            if (fast != null)
                fast = fast.next;
        }
        return null;
    }

}
