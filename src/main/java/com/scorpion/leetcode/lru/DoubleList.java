package com.scorpion.leetcode.lru;

public class DoubleList {
    private Node tail, head;
    private int size;

    public DoubleList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
        size = 0;
    }

    public void addLast(Node x) {
        x.pre = tail.pre;
        tail.pre.next = x;
        x.next = tail;
        tail.pre = x;
        size++;
    }

    public void remove(Node x) {
        x.pre.next = x.next;
        x.next.pre = x.pre;
        size--;
    }

    public Node removeFirst() {
        if (head.next == tail) return null;
        Node first = head.next;
        remove(first);
        return first;
    }

    public int size() {
        return size;
    }
}
