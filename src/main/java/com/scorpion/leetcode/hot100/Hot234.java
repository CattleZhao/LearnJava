package com.scorpion.leetcode.hot100;

import com.scorpion.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Hot234 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        int s = 0, e = list.size() - 1;
        while (s < e) {
            if (!list.get(s).equals(list.get(e))) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

}
