package com.scorpion.datastructure.AVLTree;

public class AVLNode<T extends Comparable> {

    public AVLNode<T> left;
    public AVLNode<T> right;
    public T data;
    public int height;//当前节点的高度

    public AVLNode(T data) {
        this(null, null, data);
    }

    public AVLNode(AVLNode<T> left, AVLNode<T> right, T data) {
        this(left, right, data, 0);
    }

    public AVLNode(AVLNode<T> left, AVLNode<T> right, T data, int height) {
        this.left = left;
        this.right = right;
        this.data = data;
        this.height = height;
    }


}
