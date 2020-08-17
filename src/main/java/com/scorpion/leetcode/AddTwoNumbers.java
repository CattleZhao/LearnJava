package com.scorpion.leetcode;


public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode l = result;
        int sum = 0;
        int increment = 0;
        int flag = 0;
        while (l1 != null || l2 != null) {
            if(flag == 1){
                l.next = new ListNode(0);
                l = l.next;
            }
            sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + increment;
            if (sum > 9) {
                increment = 1;
                sum -= 10;
            } else
                increment = 0;
            l.val = sum;
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
            flag = 1;
        }

        if (increment == 1) {
            l.next = new ListNode(0);
            l = l.next;
            l.val = 1;
        }
        return result;
    }

}
