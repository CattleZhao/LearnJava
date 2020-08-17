package com.scorpion.CodingInter.List;

public class removeLastKNode {
    public static Node removeLastKNode(Node head,int k){
        if (head==null||k<1)
            return head;
        Node cur = head;
        while (cur!=null){
            k--;
            cur = cur.next;
        }
        if (k==0)
            head = head.next;
        if (k<0){
            cur = head;
            while (k!=0){
                cur = cur.next;
                k++;
            }
            cur.next = cur.next.next;
        }
        return head;
    }
}

