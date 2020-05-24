package com.scorpion.DataStructure.BinarySearchTree;

public class BST {

    //指向BST的根节点
    private Node root;

    public BST() {
        this.root = null;
    }

    public Node search(int data, Node root) {
        while (root != null && data != root.data) {
            if (data < root.data)
                root = root.left;
            else
                root = root.right;
        }
        return root;
    }

    public Node searchMinimum(Node root) {
        if (root == null)
            return root;
        while (root.left != null) root = root.left;
        return root;
    }

    public Node searchMaximum(Node root) {
        if (root == null)
            return root;
        while (root.right != null) root = root.right;
        return root;
    }

    public void insert(int data, Node root) {
        Node node = new Node(data);
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;

            if (node.data < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = node;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = node;
                    return;
                }
            }
        }
    }


}
