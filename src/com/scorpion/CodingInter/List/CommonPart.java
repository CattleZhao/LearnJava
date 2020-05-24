package com.scorpion.CodingInter.List;

public class CommonPart {

    public static void printCommonPart(Node node1, Node node2) {
        while (node1 != null && node2 != null) {
            if (node1.value < node2.value) {
                node1 = node1.next;
            } else if (node1.value > node2.value) {
                node2 = node2.next;
            } else {
                node1 = node1.next;
                node2 = node2.next;
            }
        }
    }
}

class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }
}
