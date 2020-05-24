package com.scorpion.DataStructure.Queue;

import com.scorpion.DataStructure.List.singleList.Node;

import java.io.Serializable;
import java.util.NoSuchElementException;

public class LinkedQueue<E> implements Queue, Serializable {
    private static final long serialVersionUID = 1L;

    private Node<E> front, rear;

    private int size;

    private int maxSize = 128;

    public LinkedQueue() {
        this.front = this.rear = null;
    }

    @Override
    public int size() {
        return size;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean isEmpty() {
        return front == null && rear == null;
    }

    @Override
    public boolean add(Object data) {
        Node<E> q = new Node(data, null);
        if (this.front == null) {
            this.front = q;
        } else {
            this.rear.next = q;
        }
        this.rear = q;
        size++;
        return true;
    }

    @Override
    public boolean offer(Object data) {
        if (data == null)
            throw new NullPointerException("The data can\'t be null");
        if (size >= maxSize)
            throw new IllegalArgumentException("The capacity of LinkedQueue has reached its maxSize:128");

        Node<E> q = new Node(data, null);
        if (this.front == null) {//空队列插入
            this.front = q;
        } else {//非空队列,尾部插入
            this.rear.next = q;
        }
        this.rear = q;
        size++;
        return false;
    }

    @Override
    public Object peek() {
        return this.isEmpty() ? null : this.front.data;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("The LinkedQueue is empty");
        }
        return this.front.data;
    }

    @Override
    public Object poll() {
        if (this.isEmpty())
            return null;
        E x = this.front.data;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        size--;
        return x;
    }

    @Override
    public Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("The LinkedQueue is empty");
        }
        E x = this.front.data;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        size--;
        return x;
    }

    @Override
    public void clearQueue() {
        this.front = this.rear = null;
        size = 0;
    }
}
